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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wn7 extends my0 implements jm7 {
    public final vn7 l1;
    public final s09 m1;
    public qac n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wn7(Context context, boolean z, qac qacVar) {
        super(context, false);
        this.n1 = qacVar;
        final byte b = 1;
        LinearLayout i = hg9.i(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        s09 s09Var = new s09(context);
        this.m1 = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        s09Var.f(R.raw.silent_unmute, 46, 46, null);
        s09Var.d();
        int L = gm.L(72.0f);
        int i2 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.w0(null, i2, false));
        wmb M = anb.M(i2);
        s09Var.setBackground(K);
        anb.j(s09Var, K, M, null, null);
        frameLayout.addView(s09Var, qoe.e(72, 72, 17));
        vn7 vn7Var = new vn7(context);
        this.l1 = vn7Var;
        frameLayout.addView(vn7Var, qoe.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        vn7Var.a(0);
        final Object[] objArr = 0 == true ? 1 : 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: un7
            public final /* synthetic */ wn7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = objArr;
                wn7 wn7Var = this.b;
                switch (b2) {
                    case 0:
                        s09 s09Var2 = wn7Var.m1;
                        if (!s09Var2.b()) {
                            s09Var2.setProgress(0.0f);
                            s09Var2.d();
                            break;
                        }
                        break;
                    default:
                        qac qacVar2 = wn7Var.n1;
                        if (qacVar2 != null) {
                            qacVar2.a(Boolean.TRUE);
                            wn7Var.n1 = null;
                        }
                        wn7Var.dismiss();
                        break;
                }
            }
        });
        i.addView(frameLayout, qoe.o(-1, nm7.u1));
        TextView textView = new TextView(context);
        int i3 = cmb.i5;
        anb.X(textView, i3, null);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(jb6.M0(2131747619, null));
        textView.setPadding(gm.L(30.0f), 0, gm.L(30.0f), 0);
        i.addView(textView, qoe.o(-1, -2));
        TextView textView2 = new TextView(context);
        anb.X(textView2, i3, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(jb6.M0(2131747620, null));
        textView2.setPadding(gm.L(30.0f), gm.L(10.0f), gm.L(30.0f), gm.L(21.0f));
        i.addView(textView2, qoe.o(-1, -2));
        i.addView(new a6(R.drawable.msg_message_s, context, jb6.M0(2131747623, null)), qoe.o(-1, -2));
        i.addView(new a6(R.drawable.msg_members_list2, context, jb6.M0(2131747622, null)), qoe.o(-1, -2));
        i.addView(new a6(R.drawable.msg_customize_s, context, jb6.M0(2131747621, null)), qoe.o(-1, -2));
        this.O = i;
        L(cmb.g5);
        TextView textView3 = new TextView(context);
        textView3.setText(jb6.M0(z ? 2131747617 : 2131747618, null));
        textView3.setGravity(17);
        textView3.setTypeface(gm.o());
        textView3.setTextSize(1, 14.0f);
        anb.X(textView3, cmb.Ii, null);
        fg0 e = ulb.e(cmb.w0(null, i2, false), 24.0f);
        wmb M2 = anb.M(i2);
        wmb e2 = anb.e(i2);
        textView3.setBackground(e);
        anb.j(textView3, e, M2, e2, null);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: un7
            public final /* synthetic */ wn7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                wn7 wn7Var = this.b;
                switch (b2) {
                    case 0:
                        s09 s09Var2 = wn7Var.m1;
                        if (!s09Var2.b()) {
                            s09Var2.setProgress(0.0f);
                            s09Var2.d();
                            break;
                        }
                        break;
                    default:
                        qac qacVar2 = wn7Var.n1;
                        if (qacVar2 != null) {
                            qacVar2.a(Boolean.TRUE);
                            wn7Var.n1 = null;
                        }
                        wn7Var.dismiss();
                        break;
                }
            }
        });
        i.addView(textView3, qoe.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i4 = 0; i4 < 4; i4++) {
            try {
                nm7.f(i4).b(this, 2);
            } catch (Exception unused) {
            }
        }
    }

    public static void D0() {
        long j = oc7.d1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j;
        long j2 = 259200000;
        if (j >= 259200000) {
            j2 = 604800000;
            if (j >= 604800000) {
                j2 = 2592000000L;
            }
        }
        oc7.d1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j2).apply();
    }

    public static boolean E0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j = oc7.d1().getLong("askNotificationsAfter", -1L);
        if (j != -2) {
            return j < 0 || System.currentTimeMillis() >= j;
        }
        return false;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = oc7.s5;
            if ((intValue & 256) >= 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    i4 += cf7.Y(i5).L;
                }
                if (this.l1.a(i4)) {
                    s09 s09Var = this.m1;
                    if (s09Var.b()) {
                        return;
                    }
                    s09Var.setProgress(0.0f);
                    s09Var.d();
                }
            }
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        qac qacVar = this.n1;
        if (qacVar != null) {
            qacVar.a(Boolean.FALSE);
            this.n1 = null;
            D0();
        }
        for (int i = 0; i < 4; i++) {
            try {
                nm7.f(i).n(this, 2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
