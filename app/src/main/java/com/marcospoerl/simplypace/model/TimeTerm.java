package com.marcospoerl.simplypace.model;

import com.google.common.base.Objects;

import java.math.BigDecimal;

public class TimeTerm implements Term {

    private BigDecimal timeInSeconds = BigDecimal.ZERO;

    public void setTimeInSeconds(BigDecimal timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public BigDecimal getTimeInSeconds() {
        return timeInSeconds;
    }

    @Override
    public int getType() {
        return TYPE_TIME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        TimeTerm that = (TimeTerm) o;

        return Objects.equal(this.timeInSeconds, that.timeInSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.timeInSeconds);
    }
}
