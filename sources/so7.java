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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class so7 extends nx0 implements fn7 {
    public final ro7 l1;
    public final e29 m1;
    public pcc n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public so7(Context context, boolean z, pcc pccVar) {
        super(context, false);
        this.n1 = pccVar;
        final byte b = 1;
        LinearLayout j = uh9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        e29 e29Var = new e29(context);
        this.m1 = e29Var;
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        e29Var.f(R.raw.silent_unmute, 46, 46, null);
        e29Var.d();
        int L = hl.L(72.0f);
        int i = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.w0(null, i, false));
        uob M = yob.M(i);
        e29Var.setBackground(K);
        yob.j(e29Var, K, M, null, null);
        frameLayout.addView(e29Var, tre.e(72, 72, 17));
        ro7 ro7Var = new ro7(context);
        this.l1 = ro7Var;
        frameLayout.addView(ro7Var, tre.d(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        ro7Var.a(0);
        final Object[] objArr = 0 == true ? 1 : 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: qo7
            public final /* synthetic */ so7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = objArr;
                so7 so7Var = this.b;
                switch (b2) {
                    case 0:
                        e29 e29Var2 = so7Var.m1;
                        if (!e29Var2.b()) {
                            e29Var2.setProgress(0.0f);
                            e29Var2.d();
                            break;
                        }
                        break;
                    default:
                        pcc pccVar2 = so7Var.n1;
                        if (pccVar2 != null) {
                            pccVar2.a(Boolean.TRUE);
                            so7Var.n1 = null;
                        }
                        so7Var.dismiss();
                        break;
                }
            }
        });
        j.addView(frameLayout, tre.o(-1, jn7.u1));
        TextView textView = new TextView(context);
        int i2 = aob.j5;
        yob.X(textView, i2, null);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setText(ob6.M0(2131747613, null));
        textView.setPadding(hl.L(30.0f), 0, hl.L(30.0f), 0);
        j.addView(textView, tre.o(-1, -2));
        TextView textView2 = new TextView(context);
        yob.X(textView2, i2, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setText(ob6.M0(2131747614, null));
        textView2.setPadding(hl.L(30.0f), hl.L(10.0f), hl.L(30.0f), hl.L(21.0f));
        j.addView(textView2, tre.o(-1, -2));
        j.addView(new b6(R.drawable.msg_message_s, context, ob6.M0(2131747617, null)), tre.o(-1, -2));
        j.addView(new b6(R.drawable.msg_members_list2, context, ob6.M0(2131747616, null)), tre.o(-1, -2));
        j.addView(new b6(R.drawable.msg_customize_s, context, ob6.M0(2131747615, null)), tre.o(-1, -2));
        this.O = j;
        L(aob.h5);
        TextView textView3 = new TextView(context);
        textView3.setText(ob6.M0(z ? 2131747611 : 2131747612, null));
        textView3.setGravity(17);
        textView3.setTypeface(hl.o());
        textView3.setTextSize(1, 14.0f);
        yob.X(textView3, aob.Ji, null);
        hf0 e = rnb.e(aob.w0(null, i, false), 24.0f);
        uob M2 = yob.M(i);
        uob e2 = yob.e(i);
        textView3.setBackground(e);
        yob.j(textView3, e, M2, e2, null);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: qo7
            public final /* synthetic */ so7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                so7 so7Var = this.b;
                switch (b2) {
                    case 0:
                        e29 e29Var2 = so7Var.m1;
                        if (!e29Var2.b()) {
                            e29Var2.setProgress(0.0f);
                            e29Var2.d();
                            break;
                        }
                        break;
                    default:
                        pcc pccVar2 = so7Var.n1;
                        if (pccVar2 != null) {
                            pccVar2.a(Boolean.TRUE);
                            so7Var.n1 = null;
                        }
                        so7Var.dismiss();
                        break;
                }
            }
        });
        j.addView(textView3, tre.k(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        for (int i3 = 0; i3 < 4; i3++) {
            try {
                jn7.f(i3).b(this, 2);
            } catch (Exception unused) {
            }
        }
    }

    public static void E0() {
        long j = uc7.e1().getLong("askNotificationsDuration", 86400000L);
        long currentTimeMillis = System.currentTimeMillis() + j;
        long j2 = 259200000;
        if (j >= 259200000) {
            j2 = 604800000;
            if (j >= 604800000) {
                j2 = 2592000000L;
            }
        }
        uc7.e1().edit().putLong("askNotificationsAfter", currentTimeMillis).putLong("askNotificationsDuration", j2).apply();
    }

    public static boolean F0(Activity activity) {
        if (activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j = uc7.e1().getLong("askNotificationsAfter", -1L);
        if (j != -2) {
            return j < 0 || System.currentTimeMillis() >= j;
        }
        return false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = uc7.r5;
            if ((intValue & 256) >= 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    i4 += jf7.Y(i5).L;
                }
                if (this.l1.a(i4)) {
                    e29 e29Var = this.m1;
                    if (e29Var.b()) {
                        return;
                    }
                    e29Var.setProgress(0.0f);
                    e29Var.d();
                }
            }
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        pcc pccVar = this.n1;
        if (pccVar != null) {
            pccVar.a(Boolean.FALSE);
            this.n1 = null;
            E0();
        }
        for (int i = 0; i < 4; i++) {
            try {
                jn7.f(i).n(this, 2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
