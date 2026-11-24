// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tl7 extends fx0 implements gk7 {
    public final sl7 l1;
    public final ry8 m1;
    public p8c n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tl7(Context context, boolean z, p8c p8cVar) {
        super(context, false);
        this.n1 = p8cVar;
        final byte b = 1;
        LinearLayout j = de9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        ry8 ry8Var = new ry8(context);
        this.m1 = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        ry8Var.f(R.raw.silent_unmute, 46, 46, null);
        ry8Var.d();
        int L = gl.L(72.0f);
        int i = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.w0(null, i, false));
        vkb M = zkb.M(i);
        ry8Var.setBackground(K);
        zkb.j(ry8Var, K, M, null, null);
        frameLayout.addView(ry8Var, nme.e(72, 72, 17));
        sl7 sl7Var = new sl7(context);
        this.l1 = sl7Var;
        frameLayout.addView(sl7Var, nme.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        sl7Var.a(0);
        final Object[] objArr = 0 == true ? 1 : 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: rl7
            public final /* synthetic */ tl7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = objArr;
                tl7 tl7Var = this.b;
                switch (b2) {
                    case 0:
                        ry8 ry8Var2 = tl7Var.m1;
                        if (!ry8Var2.b()) {
                            ry8Var2.setProgress(0.0f);
                            ry8Var2.d();
                            break;
                        }
                        break;
                    default:
                        p8c p8cVar2 = tl7Var.n1;
                        if (p8cVar2 != null) {
                            p8cVar2.a(Boolean.TRUE);
                            tl7Var.n1 = null;
                        }
                        tl7Var.dismiss();
                        break;
                }
            }
        });
        j.addView(frameLayout, nme.o(-1, kk7.u1));
        TextView textView = new TextView(context);
        int i2 = bkb.i5;
        zkb.X(textView, i2, null);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(k96.M0(2131747693, null));
        textView.setPadding(gl.L(30.0f), 0, gl.L(30.0f), 0);
        j.addView(textView, nme.o(-1, -2));
        TextView textView2 = new TextView(context);
        zkb.X(textView2, i2, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(k96.M0(2131747694, null));
        textView2.setPadding(gl.L(30.0f), gl.L(10.0f), gl.L(30.0f), gl.L(21.0f));
        j.addView(textView2, nme.o(-1, -2));
        j.addView(new a6(R.drawable.msg_message_s, context, k96.M0(2131747697, null)), nme.o(-1, -2));
        j.addView(new a6(R.drawable.msg_members_list2, context, k96.M0(2131747696, null)), nme.o(-1, -2));
        j.addView(new a6(R.drawable.msg_customize_s, context, k96.M0(2131747695, null)), nme.o(-1, -2));
        this.O = j;
        M(bkb.g5);
        TextView textView3 = new TextView(context);
        textView3.setText(k96.M0(z ? 2131747691 : 2131747692, null));
        textView3.setGravity(17);
        textView3.setTypeface(gl.o());
        textView3.setTextSize(1, 14.0f);
        zkb.X(textView3, bkb.Ii, null);
        ff0 e = sjb.e(bkb.w0(null, i, false), 24.0f);
        vkb M2 = zkb.M(i);
        vkb e2 = zkb.e(i);
        textView3.setBackground(e);
        zkb.j(textView3, e, M2, e2, null);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: rl7
            public final /* synthetic */ tl7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                tl7 tl7Var = this.b;
                switch (b2) {
                    case 0:
                        ry8 ry8Var2 = tl7Var.m1;
                        if (!ry8Var2.b()) {
                            ry8Var2.setProgress(0.0f);
                            ry8Var2.d();
                            break;
                        }
                        break;
                    default:
                        p8c p8cVar2 = tl7Var.n1;
                        if (p8cVar2 != null) {
                            p8cVar2.a(Boolean.TRUE);
                            tl7Var.n1 = null;
                        }
                        tl7Var.dismiss();
                        break;
                }
            }
        });
        j.addView(textView3, nme.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i3 = 0; i3 < 4; i3++) {
            try {
                kk7.f(i3).b(this, 2);
            } catch (Exception unused) {
            }
        }
    }

    public static void D0() {
        long j = na7.c1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j;
        long j2 = 259200000;
        if (j >= 259200000) {
            j2 = 604800000;
            if (j >= 604800000) {
                j2 = 2592000000L;
            }
        }
        na7.c1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j2).apply();
    }

    public static boolean E0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j = na7.c1().getLong("askNotificationsAfter", -1L);
        if (j != -2) {
            return j < 0 || System.currentTimeMillis() >= j;
        }
        return false;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = na7.q5;
            if ((intValue & 256) >= 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    i4 += ad7.Y(i5).L;
                }
                if (this.l1.a(i4)) {
                    ry8 ry8Var = this.m1;
                    if (ry8Var.b()) {
                        return;
                    }
                    ry8Var.setProgress(0.0f);
                    ry8Var.d();
                }
            }
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        p8c p8cVar = this.n1;
        if (p8cVar != null) {
            p8cVar.a(Boolean.FALSE);
            this.n1 = null;
            D0();
        }
        for (int i = 0; i < 4; i++) {
            try {
                kk7.f(i).n(this, 2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
