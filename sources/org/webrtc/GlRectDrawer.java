package org.webrtc;

import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public class GlRectDrawer extends GlGenericDrawer {
    private static final String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    public GlRectDrawer() {
        super(FRAGMENT_SHADER, new ShaderCallbacks());
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    private static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private ShaderCallbacks() {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
        }
    }
}
