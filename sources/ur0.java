// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ur0 extends wgc {
    public final /* synthetic */ byte W;
    public Object a0;
    public final /* synthetic */ FrameLayout b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur0(FrameLayout frameLayout, Context context, Object obj, byte b) {
        super(context, null);
        this.W = b;
        this.b0 = frameLayout;
        this.a0 = obj;
    }

    @Override // wgc
    public final void A(int i) {
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                kea keaVar = (kea) frameLayout;
                String currentLang = keaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    keaVar.H.S0();
                    break;
                }
                break;
            case 1:
                ((lea) frameLayout).l();
                d dVar = (d) this.a0;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).W();
                    break;
                }
                break;
            default:
                nea neaVar = (nea) this.a0;
                ((oea) frameLayout).b.c0.get(i, -1);
                neaVar.d.P0(1.0f);
                break;
        }
    }

    @Override // wgc
    public final void b() {
        switch (this.W) {
            case 1:
                lea leaVar = (lea) this.b0;
                vgc vgcVar = leaVar.n;
                if (leaVar.b() && vgcVar != null) {
                    SpannableStringBuilder spannableStringBuilder = leaVar.K;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder("+ ".concat(jb6.M0(2131750031, null)));
                        pn2 pn2Var = new pn2(R.drawable.poll_add_plus, 0);
                        pn2Var.H = 0.8f;
                        spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
                        leaVar.K = spannableStringBuilder;
                    }
                    vgcVar.a(-1, spannableStringBuilder);
                    break;
                }
                break;
        }
    }

    @Override // wgc
    public final boolean c(MotionEvent motionEvent) {
        boolean z;
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                z = ((kea) frameLayout).H.F1;
                break;
            case 1:
                z = ((lea) frameLayout).g();
                break;
            default:
                return super.c(motionEvent);
        }
        return !z;
    }

    @Override // wgc
    public final void w(boolean z) {
        byte b = this.W;
        FrameLayout frameLayout = this.b0;
        switch (b) {
            case 0:
                kea keaVar = (kea) frameLayout;
                String currentLang = keaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    keaVar.H.S0();
                    break;
                }
                break;
            case 1:
                lea leaVar = (lea) frameLayout;
                leaVar.l();
                d dVar = (d) this.a0;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).W();
                    View fragmentView = dVar.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                leaVar.p();
                break;
            default:
                nea neaVar = (nea) this.a0;
                neaVar.d.P0(((oea) frameLayout).b.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // wgc
    public final void y(int i) {
        switch (this.W) {
            case 0:
                kea keaVar = (kea) this.b0;
                String currentLang = keaVar.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    keaVar.H.S0();
                    break;
                }
                break;
        }
    }

    @Override // wgc
    public final void z(int i, boolean z) {
        switch (this.W) {
            case 2:
                nea neaVar = (nea) this.a0;
                int i2 = ((oea) this.b0).b.c0.get(i, -1);
                nha nhaVar = neaVar.d;
                if (i2 > 0) {
                    nhaVar.X0(nhaVar.t1(i2).a, z);
                    break;
                } else {
                    nhaVar.X0(8, z);
                    break;
                }
            default:
                super.z(i, z);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(kea keaVar, Context context) {
        super(context, null);
        this.W = (byte) 0;
        this.b0 = keaVar;
    }
}
