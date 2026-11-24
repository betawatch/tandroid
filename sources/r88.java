// default package

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r88 extends d98 {
    public final /* synthetic */ byte p0;
    public final /* synthetic */ gk7 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r88(gk7 gk7Var, Context context, g98 g98Var, FrameLayout frameLayout, byte b) {
        super(context, g98Var, frameLayout);
        this.p0 = b;
        this.q0 = gk7Var;
    }

    @Override // d98
    public final boolean D() {
        switch (this.p0) {
            case 0:
                return !((PhotoViewer) this.q0).s;
            default:
                return super.D();
        }
    }

    @Override // d98
    public final void E() {
        switch (this.p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q0;
                if (secretMediaViewer.K && getScrollY() <= 0) {
                    gl.e3(secretMediaViewer.q1, 3000L);
                    break;
                }
                break;
        }
    }

    @Override // d98
    public final void F() {
        switch (this.p0) {
            case 1:
                gl.r(((SecretMediaViewer) this.q0).q1);
                break;
        }
    }

    @Override // d98
    public final void G() {
        switch (this.p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q0;
                if (secretMediaViewer.J0 == null) {
                    secretMediaViewer.l(((float) getScrollY()) < ((float) getMeasuredHeight()) / 3.0f && secretMediaViewer.j0, true);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.p0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.q0;
                u78[] u78VarArr = photoViewer.X0;
                ImageView[] imageViewArr = photoViewer.y3;
                if (photoViewer.K) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.R1.getTranslationY();
                    boolean z = scrollY == 0 && translationY == 0.0f;
                    boolean z2 = scrollY == 0 && translationY == 0.0f;
                    if (!z) {
                        int b = u78VarArr[0].b() + u78VarArr[0].j;
                        int top = (((photoViewer.a2.getTop() + ((int) translationY)) - scrollY) + (a.getCurrentActionBarHeight() + (D() ? gl.m : 0))) - gl.L(12.0f);
                        boolean z3 = top > gl.L(32.0f) + ((int) imageViewArr[0].getY());
                        z = top > b;
                        z2 = z3;
                    }
                    if (photoViewer.z3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z2) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new l48(this, (byte) 7)).start();
                        } else if (imageViewArr[0].getTag() == null && !z2) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    u78VarArr[0].e(2, z ? 1.0f : 0.0f, true);
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }
}
