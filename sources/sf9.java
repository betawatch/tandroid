// default package

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vf9 b;

    public /* synthetic */ sf9(vf9 vf9Var, byte b) {
        this.a = b;
        this.b = vf9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2;
        lk0 lk0Var;
        lk0 lk0Var2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        byte b = this.a;
        final byte b2 = 1;
        final vf9 vf9Var = this.b;
        final byte b3 = 0;
        switch (b) {
            case 0:
                ArrayList arrayList = vf9Var.F;
                int indexOf = arrayList.indexOf(view);
                if (vf9Var.O != null && vf9Var.a != null) {
                    List o = vf9Var.o();
                    if (indexOf >= 0 && indexOf < o.size() && indexOf < arrayList.size()) {
                        final iy6 iy6Var = (iy6) o.get(indexOf);
                        cs5 J = vf9Var.O.a.p3.J((View) arrayList.get(indexOf));
                        if (iy6Var.n) {
                            i = R.drawable.msg_spoiler_off;
                            i2 = 2131751418;
                        } else {
                            i = R.drawable.msg_spoiler;
                            i2 = 2131751142;
                        }
                        J.b(i, k96.M0(i2, null), new Runnable() { // from class: tf9
                            @Override // java.lang.Runnable
                            public final void run() {
                                lk0 lk0Var3;
                                lk0 lk0Var4;
                                byte b4 = b3;
                                iy6 iy6Var2 = iy6Var;
                                vf9 vf9Var2 = vf9Var;
                                switch (b4) {
                                    case 0:
                                        re9 re9Var = vf9Var2.O;
                                        if (re9Var != null && (lk0Var3 = vf9Var2.a) != null) {
                                            ye9 ye9Var = re9Var.a;
                                            ld9 ld9Var = ye9Var.R3;
                                            if (ld9Var != null) {
                                                ld9Var.d();
                                            }
                                            iy6Var2.n = !iy6Var2.n;
                                            TL_iv.PageBlock J3 = ye9.J3(lk0Var3, iy6Var2);
                                            if (J3 instanceof TL_iv.pageBlockPhoto) {
                                                ((TL_iv.pageBlockPhoto) J3).spoiler = iy6Var2.n;
                                            } else if (J3 instanceof TL_iv.pageBlockVideo) {
                                                ((TL_iv.pageBlockVideo) J3).spoiler = iy6Var2.n;
                                            }
                                            ye9Var.o4(lk0Var3);
                                            ld9 ld9Var2 = ye9Var.R3;
                                            if (ld9Var2 != null) {
                                                ld9Var2.h();
                                            }
                                            ye9Var.p3.onContentChanged();
                                            break;
                                        }
                                        break;
                                    default:
                                        re9 re9Var2 = vf9Var2.O;
                                        if (re9Var2 != null && (lk0Var4 = vf9Var2.a) != null) {
                                            re9Var2.a.n2(lk0Var4, iy6Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        J.b(R.drawable.msg_delete, k96.M0(2131751586, null), new Runnable() { // from class: tf9
                            @Override // java.lang.Runnable
                            public final void run() {
                                lk0 lk0Var3;
                                lk0 lk0Var4;
                                byte b4 = b2;
                                iy6 iy6Var2 = iy6Var;
                                vf9 vf9Var2 = vf9Var;
                                switch (b4) {
                                    case 0:
                                        re9 re9Var = vf9Var2.O;
                                        if (re9Var != null && (lk0Var3 = vf9Var2.a) != null) {
                                            ye9 ye9Var = re9Var.a;
                                            ld9 ld9Var = ye9Var.R3;
                                            if (ld9Var != null) {
                                                ld9Var.d();
                                            }
                                            iy6Var2.n = !iy6Var2.n;
                                            TL_iv.PageBlock J3 = ye9.J3(lk0Var3, iy6Var2);
                                            if (J3 instanceof TL_iv.pageBlockPhoto) {
                                                ((TL_iv.pageBlockPhoto) J3).spoiler = iy6Var2.n;
                                            } else if (J3 instanceof TL_iv.pageBlockVideo) {
                                                ((TL_iv.pageBlockVideo) J3).spoiler = iy6Var2.n;
                                            }
                                            ye9Var.o4(lk0Var3);
                                            ld9 ld9Var2 = ye9Var.R3;
                                            if (ld9Var2 != null) {
                                                ld9Var2.h();
                                            }
                                            ye9Var.p3.onContentChanged();
                                            break;
                                        }
                                        break;
                                    default:
                                        re9 re9Var2 = vf9Var2.O;
                                        if (re9Var2 != null && (lk0Var4 = vf9Var2.a) != null) {
                                            re9Var2.a.n2(lk0Var4, iy6Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        J.b0(0.0f, -gl.L(38.0f));
                        if (vf9Var.I) {
                            J.u = false;
                            J.v = true;
                            J.s = (short) 0;
                        }
                        J.a0();
                        break;
                    }
                }
                break;
            case 1:
                re9 re9Var = vf9Var.O;
                if (re9Var != null && (lk0Var = vf9Var.a) != null) {
                    ye9 ye9Var = re9Var.a;
                    ye9Var.j4 = lk0Var;
                    ye9Var.p3.c(0);
                    break;
                }
                break;
            default:
                re9 re9Var2 = vf9Var.O;
                if (re9Var2 != null && (lk0Var2 = vf9Var.a) != null) {
                    ye9 ye9Var2 = re9Var2.a;
                    if (ye9.x3(lk0Var2.b)) {
                        ld9 ld9Var = ye9Var2.R3;
                        if (ld9Var != null) {
                            ld9Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> c3 = ye9.c3(lk0Var2.b);
                        TL_iv.PageBlock pageBlock = lk0Var2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (c3 == null) {
                                c3 = new ArrayList<>();
                            }
                            pageblockcollage.items = c3;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (c3 == null) {
                                c3 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = c3;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        lk0Var2.b = pageblockslideshow;
                        ld9 ld9Var2 = ye9Var2.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.h();
                        }
                        View C1 = ye9Var2.C1(lk0Var2);
                        if (C1 instanceof vf9) {
                            vf9 vf9Var2 = (vf9) C1;
                            ValueAnimator valueAnimator = vf9Var2.j0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                vf9Var2.j0 = null;
                            }
                            if (vf9Var2.getParent() != null) {
                                vf9Var2.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = vf9Var2.i0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                vf9Var2.i0 = null;
                            }
                            vf9Var2.a0 = 0;
                            vf9Var2.b0 = 0.0f;
                            vf9Var2.q(true);
                            vf9Var2.requestLayout();
                            vf9Var2.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
