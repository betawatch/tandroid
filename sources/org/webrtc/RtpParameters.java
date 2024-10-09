package org.webrtc;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public class RtpParameters {
    public final List<Codec> codecs;
    public DegradationPreference degradationPreference;
    public final List<Encoding> encodings;
    private final List<HeaderExtension> headerExtensions;
    private final Rtcp rtcp;
    public final String transactionId;

    /* loaded from: classes.dex */
    public static class Codec {
        public Integer clockRate;
        MediaStreamTrack.MediaType kind;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int payloadType;

        Codec(int i, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, Map<String, String> map) {
            this.payloadType = i;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
        }

        Integer getClockRate() {
            return this.clockRate;
        }

        MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        String getName() {
            return this.name;
        }

        Integer getNumChannels() {
            return this.numChannels;
        }

        Map getParameters() {
            return this.parameters;
        }

        int getPayloadType() {
            return this.payloadType;
        }
    }

    /* loaded from: classes.dex */
    public enum DegradationPreference {
        DISABLED,
        MAINTAIN_FRAMERATE,
        MAINTAIN_RESOLUTION,
        BALANCED;

        static DegradationPreference fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* loaded from: classes.dex */
    public static class Encoding {
        public boolean active;
        public double bitratePriority;
        public Integer maxBitrateBps;
        public Integer maxFramerate;
        public Integer minBitrateBps;
        public int networkPriority;
        public Integer numTemporalLayers;
        public String rid;
        public Double scaleResolutionDownBy;
        public Long ssrc;

        Encoding(String str, boolean z, double d, int i, Integer num, Integer num2, Integer num3, Integer num4, Double d2, Long l) {
            this.rid = str;
            this.active = z;
            this.bitratePriority = d;
            this.networkPriority = i;
            this.maxBitrateBps = num;
            this.minBitrateBps = num2;
            this.maxFramerate = num3;
            this.numTemporalLayers = num4;
            this.scaleResolutionDownBy = d2;
            this.ssrc = l;
        }

        public Encoding(String str, boolean z, Double d) {
            this.bitratePriority = 1.0d;
            this.networkPriority = 0;
            this.rid = str;
            this.active = z;
            this.scaleResolutionDownBy = d;
        }

        boolean getActive() {
            return this.active;
        }

        double getBitratePriority() {
            return this.bitratePriority;
        }

        Integer getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        Integer getMaxFramerate() {
            return this.maxFramerate;
        }

        Integer getMinBitrateBps() {
            return this.minBitrateBps;
        }

        int getNetworkPriority() {
            return this.networkPriority;
        }

        Integer getNumTemporalLayers() {
            return this.numTemporalLayers;
        }

        String getRid() {
            return this.rid;
        }

        Double getScaleResolutionDownBy() {
            return this.scaleResolutionDownBy;
        }

        Long getSsrc() {
            return this.ssrc;
        }
    }

    /* loaded from: classes.dex */
    public static class HeaderExtension {
        private final boolean encrypted;
        private final int id;
        private final String uri;

        HeaderExtension(String str, int i, boolean z) {
            this.uri = str;
            this.id = i;
            this.encrypted = z;
        }

        public boolean getEncrypted() {
            return this.encrypted;
        }

        public int getId() {
            return this.id;
        }

        public String getUri() {
            return this.uri;
        }
    }

    /* loaded from: classes.dex */
    public static class Rtcp {
        private final String cname;
        private final boolean reducedSize;

        Rtcp(String str, boolean z) {
            this.cname = str;
            this.reducedSize = z;
        }

        public String getCname() {
            return this.cname;
        }

        public boolean getReducedSize() {
            return this.reducedSize;
        }
    }

    RtpParameters(String str, DegradationPreference degradationPreference, Rtcp rtcp, List<HeaderExtension> list, List<Encoding> list2, List<Codec> list3) {
        this.transactionId = str;
        this.degradationPreference = degradationPreference;
        this.rtcp = rtcp;
        this.headerExtensions = list;
        this.encodings = list2;
        this.codecs = list3;
    }

    List<Codec> getCodecs() {
        return this.codecs;
    }

    DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    List<Encoding> getEncodings() {
        return this.encodings;
    }

    public List<HeaderExtension> getHeaderExtensions() {
        return this.headerExtensions;
    }

    public Rtcp getRtcp() {
        return this.rtcp;
    }

    String getTransactionId() {
        return this.transactionId;
    }
}
