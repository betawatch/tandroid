// default package

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x42 extends i49 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public x42(dmc dmcVar) {
        this.a = (byte) 1;
        this.c = dmcVar;
        this.b = false;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        y29 y29Var;
        int topScrollOffset;
        int topScrollOffset2;
        byte b = this.a;
        boolean z = false;
        Object obj = this.c;
        switch (b) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                s42 s42Var = chatAttachAlertPhotoLayout.F;
                x02 x02Var = chatAttachAlertPhotoLayout.b;
                if (i == 0) {
                    int L = gl.L(13.0f);
                    r7 r7Var = x02Var.X2;
                    int L2 = L + (r7Var != null ? gl.L(r7Var.getAlpha() * 26.0f) : 0);
                    int i2 = x02Var.t0;
                    if (((x02Var.Y3[0] - i2) - L2) + i2 < (x02Var.L2.getAlpha() * x02Var.L2.getMeasuredHeight()) + a.getCurrentActionBarHeight() && (y29Var = (y29) s42Var.K(0)) != null) {
                        View view = y29Var.a;
                        int top = view.getTop();
                        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
                        if (top > topScrollOffset) {
                            int top2 = view.getTop();
                            topScrollOffset2 = chatAttachAlertPhotoLayout.getTopScrollOffset();
                            s42Var.x0(0, top2 - topScrollOffset2, null);
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (i == 0 && this.b) {
                    this.b = false;
                    ((dmc) obj).f();
                    break;
                }
                break;
            default:
                t5b t5bVar = (t5b) obj;
                o39 o39Var = t5bVar.f;
                if (i == 1) {
                    y5b y5bVar = t5bVar.a0;
                    int i3 = y5b.X1;
                    if (y5bVar.d && t5bVar.y != null) {
                        y5bVar.F0();
                    }
                }
                if (i == 0) {
                    t5bVar.T = !o39Var.canScrollVertically(-1);
                    o39Var.canScrollVertically(1);
                } else {
                    z = true;
                }
                t5bVar.N = z;
                break;
        }
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                x02 x02Var = chatAttachAlertPhotoLayout.b;
                s42 s42Var = chatAttachAlertPhotoLayout.F;
                if (s42Var.getChildCount() > 0) {
                    x02Var.H1(chatAttachAlertPhotoLayout, i2);
                    if (chatAttachAlertPhotoLayout.H.b() > 30) {
                        boolean z = this.b;
                        boolean z2 = x02Var.L1;
                        if (z != z2) {
                            this.b = z2;
                            ug8.s(s42Var.getFastScroll().animate(), this.b ? 1.0f : 0.0f, 100L);
                        }
                    } else {
                        s42Var.getFastScroll().setAlpha(0.0f);
                    }
                    if (i2 != 0) {
                        chatAttachAlertPhotoLayout.W();
                        break;
                    }
                }
                break;
            case 1:
                if (i != 0 || i2 != 0) {
                    this.b = true;
                    break;
                }
            default:
                t5b t5bVar = (t5b) obj;
                y5b y5bVar = t5bVar.a0;
                o39 o39Var = t5bVar.f;
                boolean canScrollVertically = o39Var.canScrollVertically(1);
                if (canScrollVertically != this.b) {
                    t5bVar.r.invalidate();
                    this.b = canScrollVertically;
                }
                t5bVar.e.invalidate();
                int i3 = y5b.X1;
                y5bVar.b.invalidate();
                if (t5bVar.a == 6 && o39Var.getChildCount() > 0 && RecyclerView.R(o39Var.getChildAt(0)) >= na7.q1(y5bVar.a).M1().L.size()) {
                    na7.q1(y5bVar.a).M1().R();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x42(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.c = frameLayout;
    }
}
