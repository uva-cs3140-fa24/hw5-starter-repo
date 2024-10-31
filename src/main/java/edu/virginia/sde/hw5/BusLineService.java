package edu.virginia.sde.hw5;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.NoSuchElementException;

public class BusLineService {
    private final BusDatabase busDatabase;

    public BusLineService(BusDatabase busDatabase) {
        this.busDatabase = busDatabase;
    }

    /**
     * Return the closest stop to a given coordinate (using Euclidean distance, not great circle distance)
     * @param latitude - North/South coordinate (positive is North, Negative is South) in degrees
     * @param longitude - East/West coordinate (negative is West, Positive is East) in degrees
     * @return the closest Stop
     */
    public Stop getClosestStop(double latitude, double longitude) {
        //TODO: implement
        return null;
    }

    /**
     * Return the closest stop to a given coordinate (using Euclidean distance, not great circle distance)
     * that is visited by a specific Bus Line name (i.e., "Red Line"
     * @param latitude - North/South coordinate (positive is North, Negative is South) in degrees
     * @param longitude - East/West coordinate (negative is West, Positive is East) in degrees
     * @throws NoSuchElementException if the BusLine doesn't exist **or** has no stops.
     * @return the closest Stop
     */
    public Stop getClosestStopByBusline(double latitude, double longitude, String busLongName) {
        //TODO: implement
        return null;
    }

    /**
     * Given two stop, a source and a destination, find the shortest (by distance) BusLine that starts
     * from source and ends at Destination.
     * @return Optional.empty() if no bus route visits both points
     * @throws IllegalArgumentException if either or both stops don't exist in the database
     */
    public Optional<BusLine> getRecommendedBusLine(String sourceStopName, String destinationStopName) {
        //TODO: implement
        return Optional.empty();
    }
}
