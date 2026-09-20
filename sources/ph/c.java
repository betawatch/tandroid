package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.r0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class c {
    public final b1 a;
    public b c = b.a;
    public final r0 d = new r0(this, 14);
    public final long b = (long) ((AndroidUtilities.getAnimatorDurationScale() * 250.0f) * 1.1f);

    public c(b1 b1Var) {
        this.a = b1Var;
    }

    public final void a(b bVar, boolean z10) {
        if (this.c != bVar) {
            r0 r0Var = this.d;
            AndroidUtilities.cancelRunOnUIThread(r0Var);
            this.c = bVar;
            if (z10) {
                this.a.run(bVar);
            }
            if (bVar == b.b || bVar == b.c) {
                AndroidUtilities.runOnUIThread(r0Var, this.b);
            }
        }
    }
}
