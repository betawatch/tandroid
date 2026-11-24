// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wt3 extends n39 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ zt3 f;

    public wt3(zt3 zt3Var, Context context) {
        this.f = zt3Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 1 || i == 3;
    }

    @Override // w39
    public final int b() {
        return this.f.w;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 2;
        }
        zt3 zt3Var = this.f;
        if (i == zt3Var.h) {
            return 1;
        }
        return i == zt3Var.s ? 0 : 3;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        zt3 zt3Var = this.f;
        if (i2 == 0) {
            mhb mhbVar = (mhb) view;
            if (i == zt3Var.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i3 = zt3Var.x;
                if (i3 == 0) {
                    spannableStringBuilder.append((CharSequence) k96.M0(2131751200, null));
                } else if (i3 == 1) {
                    spannableStringBuilder.append((CharSequence) k96.M0(2131751199, null));
                }
                if (gba.r.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) gl.S2(k96.M0(2131742608, null)));
                }
                mhbVar.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 == 3) {
                za5 za5Var = (za5) view;
                Long l = (Long) zt3Var.e.get(i - zt3Var.n);
                long longValue = l.longValue();
                if (cf3.D(longValue)) {
                    za5Var.e(zt3Var.getMessagesController().V1(l), null, null, i != zt3Var.r - 1);
                    return;
                } else {
                    za5Var.e(zt3Var.getMessagesController().K0(Long.valueOf(-longValue)), null, null, i != zt3Var.r - 1);
                    return;
                }
            }
            return;
        }
        wgb wgbVar = (wgb) view;
        wgbVar.g(-1, bkb.p6);
        if (this.d == null) {
            Context context = this.c;
            this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
            this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
        }
        Drawable drawable = this.d;
        Drawable drawable2 = this.e;
        int i4 = bkb.M6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        zkb.x(wgbVar, drawable, i4, null, mode);
        zkb.x(wgbVar, drawable2, bkb.j7, null, mode);
        wgbVar.p(k96.M0(2131745476, null), new fm2(drawable, drawable2), zt3Var.n != -1);
        wgbVar.getImageView().setPadding(0, gl.L(7.0f), 0, 0);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i == 0) {
            FrameLayout mhbVar = new mhb(context);
            zkb.Z(mhbVar, context, R.drawable.greydivider_bottom, bkb.a7);
            frameLayout = mhbVar;
        } else if (i != 1) {
            byte b = 2;
            if (i != 2) {
                FrameLayout za5Var = new za5(context, 0, 0, false);
                ImageView k = tb4.k(context, R.drawable.list_reorder);
                k.setScaleType(ImageView.ScaleType.CENTER);
                za5Var.setTag(R.id.object_tag, k);
                za5Var.addView(k, nme.d(40, -1.0f, (k96.a0 ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                k.setOnTouchListener(new f8(this, za5Var, b));
                zkb.s(k, bkb.a9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout = za5Var;
            } else {
                zt3 zt3Var = this.f;
                yt3 yt3Var = new yt3(zt3Var, context);
                zt3Var.f = yt3Var;
                frameLayout = yt3Var;
            }
        } else {
            FrameLayout wgbVar = new wgb(context);
            zkb.h(bkb.c6, null, wgbVar);
            frameLayout = wgbVar;
        }
        return new y29(frameLayout);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        int i = s49Var.f;
        if (i == 3 || i == 1) {
            zkb.h(bkb.c6, null, s49Var.a);
        }
    }
}
