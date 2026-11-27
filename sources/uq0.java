// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uq0 extends vic {
    public final /* synthetic */ byte W;
    public Object a0;
    public final /* synthetic */ FrameLayout b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uq0(FrameLayout frameLayout, Context context, Object obj, byte b) {
        super(context, null);
        this.W = b;
        this.b0 = frameLayout;
        this.a0 = obj;
    }

    @Override // vic
    public final void A(int i, boolean z) {
        switch (this.W) {
            case 2:
                ega egaVar = (ega) this.a0;
                int i2 = ((fga) this.b0).b.c0.get(i, -1);
                eja ejaVar = egaVar.d;
                if (i2 > 0) {
                    ejaVar.X0(ejaVar.t1(i2).a, z);
                    break;
                } else {
                    ejaVar.X0(8, z);
                    break;
                }
            default:
                super.A(i, z);
                break;
        }
    }

    @Override // vic
    public final void B(int i) {
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                bga bgaVar = (bga) frameLayout;
                String currentLang = bgaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    bgaVar.H.S0();
                    break;
                }
                break;
            case 1:
                ((cga) frameLayout).l();
                e eVar = (e) this.a0;
                if (eVar instanceof ProfileActivity) {
                    ((ProfileActivity) eVar).V();
                    break;
                }
                break;
            default:
                ega egaVar = (ega) this.a0;
                ((fga) frameLayout).b.c0.get(i, -1);
                egaVar.d.P0(1.0f);
                break;
        }
    }

    @Override // vic
    public final void b() {
        switch (this.W) {
            case 1:
                cga cgaVar = (cga) this.b0;
                uic uicVar = cgaVar.n;
                if (cgaVar.b() && uicVar != null) {
                    SpannableStringBuilder spannableStringBuilder = cgaVar.K;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder("+ ".concat(ob6.M0(2131750057, null)));
                        wm2 wm2Var = new wm2(R.drawable.poll_add_plus, 0);
                        wm2Var.H = 0.8f;
                        spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
                        cgaVar.K = spannableStringBuilder;
                    }
                    uicVar.a(-1, spannableStringBuilder);
                    break;
                }
                break;
        }
    }

    @Override // vic
    public final boolean c(MotionEvent motionEvent) {
        boolean z;
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                z = ((bga) frameLayout).H.F1;
                break;
            case 1:
                z = ((cga) frameLayout).g();
                break;
            default:
                return super.c(motionEvent);
        }
        return !z;
    }

    @Override // vic
    public final void x(boolean z) {
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                bga bgaVar = (bga) frameLayout;
                String currentLang = bgaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    bgaVar.H.S0();
                    break;
                }
                break;
            case 1:
                cga cgaVar = (cga) frameLayout;
                cgaVar.l();
                e eVar = (e) this.a0;
                if (eVar instanceof ProfileActivity) {
                    ((ProfileActivity) eVar).V();
                    View fragmentView = eVar.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                cgaVar.p();
                break;
            default:
                ega egaVar = (ega) this.a0;
                egaVar.d.P0(((fga) frameLayout).b.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // vic
    public final void z(int i) {
        switch (this.W) {
            case 0:
                bga bgaVar = (bga) this.b0;
                String currentLang = bgaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    bgaVar.H.S0();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(bga bgaVar, Context context) {
        super(context, null);
        this.W = (byte) 0;
        this.b0 = bgaVar;
    }
}
