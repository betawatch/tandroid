package org.webrtc;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class RtpCapabilities {
    public List<CodecCapability> codecs;
    public List<HeaderExtensionCapability> headerExtensions;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    public static class HeaderExtensionCapability {
        private final boolean preferredEncrypted;
        private final int preferredId;
        private final String uri;

        public HeaderExtensionCapability(String str, int i, boolean z) {
            this.uri = str;
            this.preferredId = i;
            this.preferredEncrypted = z;
        }

        public boolean getPreferredEncrypted() {
            return this.preferredEncrypted;
        }

        public int getPreferredId() {
            return this.preferredId;
        }

        public String getUri() {
            return this.uri;
        }
    }

    public RtpCapabilities(List<CodecCapability> list, List<HeaderExtensionCapability> list2) {
        this.headerExtensions = list2;
        this.codecs = list;
    }

    public List<CodecCapability> getCodecs() {
        return this.codecs;
    }

    public List<HeaderExtensionCapability> getHeaderExtensions() {
        return this.headerExtensions;
    }

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    public static class CodecCapability {
        public Integer clockRate;
        public MediaStreamTrack.MediaType kind;
        public String mimeType;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int preferredPayloadType;

        public CodecCapability(int i, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, String str2, Map<String, String> map) {
            this.preferredPayloadType = i;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
            this.mimeType = str2;
        }

        public Integer getClockRate() {
            return this.clockRate;
        }

        public MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        public String getName() {
            return this.name;
        }

        public Integer getNumChannels() {
            return this.numChannels;
        }

        public Map<String, String> getParameters() {
            return this.parameters;
        }

        public int getPreferredPayloadType() {
            return this.preferredPayloadType;
        }

        public CodecCapability() {
        }
    }
}
