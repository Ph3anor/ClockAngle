package br.com.watch.api.dto;

public class GetAngleResponseDTO {

	private double angle;

	public GetAngleResponseDTO(double angle) {
		this.angle = angle;
	}

	public double getAngle() {
		return angle;
	}

}
