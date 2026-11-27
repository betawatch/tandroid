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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ou3 extends c79 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ ru3 f;

    public ou3(ru3 ru3Var, Context context) {
        this.f = ru3Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 1 || i == 3;
    }

    @Override // j79
    public final int b() {
        return this.f.w;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 2;
        }
        ru3 ru3Var = this.f;
        if (i == ru3Var.h) {
            return 1;
        }
        return i == ru3Var.s ? 0 : 3;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        ru3 ru3Var = this.f;
        if (i2 == 0) {
            ilb ilbVar = (ilb) view;
            if (i == ru3Var.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i3 = ru3Var.x;
                if (i3 == 0) {
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131751177, null));
                } else if (i3 == 1) {
                    spannableStringBuilder.append((CharSequence) ob6.M0(2131751176, null));
                }
                if (xea.r.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) hl.S2(ob6.M0(2131742502, null)));
                }
                ilbVar.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 == 3) {
                bd5 bd5Var = (bd5) view;
                Long l = (Long) ru3Var.e.get(i - ru3Var.n);
                long longValue = l.longValue();
                if (wf3.D(longValue)) {
                    bd5Var.e(ru3Var.getMessagesController().X1(l), null, null, i != ru3Var.r - 1);
                    return;
                } else {
                    bd5Var.e(ru3Var.getMessagesController().M0(Long.valueOf(-longValue)), null, null, i != ru3Var.r - 1);
                    return;
                }
            }
            return;
        }
        skb skbVar = (skb) view;
        skbVar.g(-1, aob.q6);
        if (this.d == null) {
            Context context = this.c;
            this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
            this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
        }
        Drawable drawable = this.d;
        Drawable drawable2 = this.e;
        int i4 = aob.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        yob.x(skbVar, drawable, i4, null, mode);
        yob.x(skbVar, drawable2, aob.k7, null, mode);
        skbVar.p(ob6.M0(2131745396, null), new zm2(drawable, drawable2), ru3Var.n != -1);
        skbVar.getImageView().setPadding(0, hl.L(7.0f), 0, 0);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i == 0) {
            FrameLayout ilbVar = new ilb(context);
            yob.Z(ilbVar, context, R.drawable.greydivider_bottom, aob.b7);
            frameLayout = ilbVar;
        } else if (i != 1) {
            byte b = 2;
            if (i != 2) {
                FrameLayout bd5Var = new bd5(context, 0, 0, false);
                ImageView k = qd4.k(context, R.drawable.list_reorder);
                k.setScaleType(ImageView.ScaleType.CENTER);
                bd5Var.setTag(R.id.object_tag, k);
                bd5Var.addView(k, tre.d(40, -1.0f, (ob6.a0 ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                k.setOnTouchListener(new g8(this, bd5Var, b));
                yob.s(k, aob.b9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout = bd5Var;
            } else {
                ru3 ru3Var = this.f;
                qu3 qu3Var = new qu3(ru3Var, context);
                ru3Var.f = qu3Var;
                frameLayout = qu3Var;
            }
        } else {
            FrameLayout skbVar = new skb(context);
            yob.h(aob.d6, null, skbVar);
            frameLayout = skbVar;
        }
        return new n69(frameLayout);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        int i = f89Var.f;
        if (i == 3 || i == 1) {
            yob.h(aob.d6, null, f89Var.a);
        }
    }
}
