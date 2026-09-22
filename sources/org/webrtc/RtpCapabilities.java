package org.webrtc;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public class RtpCapabilities {
    public List<CodecCapability> codecs;
    public List<HeaderExtensionCapability> headerExtensions;

    /* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
    public static class CodecCapability {
        public Integer clockRate;
        public MediaStreamTrack.MediaType kind;
        public String mimeType;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int preferredPayloadType;

        public CodecCapability() {
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

        public Map getParameters() {
            return this.parameters;
        }

        public int getPreferredPayloadType() {
            return this.preferredPayloadType;
        }

        public CodecCapability(int i10, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, String str2, Map<String, String> map) {
            this.preferredPayloadType = i10;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
            this.mimeType = str2;
        }
    }

    /* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
    public static class HeaderExtensionCapability {
        private final boolean preferredEncrypted;
        private final int preferredId;
        private final String uri;

        public HeaderExtensionCapability(String str, int i10, boolean z10) {
            this.uri = str;
            this.preferredId = i10;
            this.preferredEncrypted = z10;
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
}
