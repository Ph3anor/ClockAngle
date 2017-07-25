package br.com.watch.api.controller;

import java.util.Calendar;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.watch.api.dto.GetAngleDTO;
import br.com.watch.api.dto.GetAngleResponseDTO;
import br.com.watch.utils.ClockUtils;

@Path("/clock")
public class Controller {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public GetAngleResponseDTO getClock(GetAngleDTO getAngleDTO) {
		final Integer hour = getAngleDTO.getHour();
		final Integer minutes = getAngleDTO.getMinutes();

		final Calendar calendar = ClockUtils.getCalendar(hour, minutes);
		final double angle = ClockUtils.getClockAngle(calendar);

		return new GetAngleResponseDTO(angle);
	}

}