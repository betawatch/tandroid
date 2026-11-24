// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t65 implements vl5 {
    public float a;
    public TLRPC.FileLocation b;
    public TLRPC.FileLocation c;
    public gl5 d;
    public final long e;
    public final /* synthetic */ h75 f;

    public t65(h75 h75Var, long j) {
        this.f = h75Var;
        this.e = j;
    }

    @Override // vl5
    public final void H(float f) {
        this.f.l1.O(this.d, f);
        a(f);
    }

    @Override // vl5
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.d3(new ph1((vl5) this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, (byte) 3));
    }

    public final void a(float f) {
        this.a = f;
        r65 r65Var = this.f.J1;
        if (r65Var != null) {
            for (int i = 0; i < r65Var.getChildCount(); i++) {
                View childAt = r65Var.getChildAt(i);
                if (childAt instanceof y95) {
                    y95 y95Var = (y95) childAt;
                    if (y95Var.c()) {
                        u95 u95Var = y95Var.y;
                        u95Var.setProgress(f);
                        if (f < 1.0f) {
                            gl.U3(u95Var, true, 1.0f, true, true);
                        } else {
                            gl.U3(u95Var, false, 1.0f, true, true);
                        }
                    }
                }
            }
        }
    }

    @Override // vl5
    public final boolean c() {
        return true;
    }

    @Override // vl5
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override // vl5
    public final String getInitialSearchString() {
        return null;
    }

    @Override // vl5
    public final boolean x() {
        return false;
    }

    @Override // vl5
    public final void T() {
    }

    @Override // vl5
    public final void O(boolean z, boolean z2) {
    }
}
