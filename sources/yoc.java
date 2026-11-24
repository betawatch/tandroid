// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class yoc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yoc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zoc zocVar = (zoc) obj;
                EditTextBoldCursor editTextBoldCursor = zocVar.b;
                if (zocVar.s == animator) {
                    zocVar.s = null;
                    zocVar.a.setVisibility(zocVar.E ? 4 : 0);
                    editTextBoldCursor.setVisibility(zocVar.E ? 0 : 4);
                    if (zocVar.E && !zocVar.F) {
                        editTextBoldCursor.requestFocus();
                        gl.F3(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 1:
                ppc ppcVar = (ppc) obj;
                ppcVar.n = null;
                ppcVar.d.setVisibility(ppcVar.x ? 4 : 0);
                ppcVar.f.setVisibility(ppcVar.y ? 0 : 4);
                break;
            case 2:
                ((stc) obj).f0 = null;
                break;
            case 3:
                ((tuc) ((su) obj).b).c.setVisibility(4);
                break;
            default:
                ((azc) obj).L = null;
                break;
        }
    }
}
