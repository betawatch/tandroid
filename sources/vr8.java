// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vr8 extends hca {
    public final /* synthetic */ wr8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr8(wr8 wr8Var, Context context, vnb vnbVar) {
        super(context);
        this.h = wr8Var;
        this.f = yac.t0;
        final byte b = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        bs2.t(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        yob.X(textView, aob.L6, vnbVar);
        addView(textView, tre.t(-1, -2, (ob6.a0 ? 5 : 3) | 48, 21, 15, 21, 0));
        p66 p66Var = new p66(context, vnbVar);
        this.b = p66Var;
        yob.X(p66Var, aob.G6, vnbVar);
        p66Var.setTextSize(1, 14.0f);
        yob.G(p66Var, aob.J6, vnbVar);
        yob.C(p66Var, aob.K6, vnbVar);
        final byte b2 = 0;
        p66Var.setMovementMethod(new dl((byte) 0));
        p66Var.setGravity(ob6.a0 ? 5 : 3);
        addView(p66Var, tre.t(-2, -2, ob6.a0 ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, tre.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i = 0;
        while (i < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(rnb.f(aob.Fi, 8.0f));
            iye.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            qd4.w(textView2, aob.Ji, vnbVar, 1, 14.0f);
            linearLayout.addView(textView2, tre.m(0.5f, 0, 44, i == 0 ? 0 : 4, i == 0 ? 4 : 0, 0));
            if (i == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: gca
                    public final /* synthetic */ vr8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        vr8 vr8Var = this.b;
                        switch (b3) {
                            case 0:
                                hl.c3(new oe7(vr8Var, vr8Var.e, (byte) 9));
                                break;
                            default:
                                int i2 = vr8Var.e;
                                ProfileActivity profileActivity = vr8Var.h.e;
                                if (i2 != 0) {
                                    profileActivity.presentFragment(new o7c(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new v8(3));
                                    break;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: gca
                    public final /* synthetic */ vr8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        vr8 vr8Var = this.b;
                        switch (b3) {
                            case 0:
                                hl.c3(new oe7(vr8Var, vr8Var.e, (byte) 9));
                                break;
                            default:
                                int i2 = vr8Var.e;
                                ProfileActivity profileActivity = vr8Var.h.e;
                                if (i2 != 0) {
                                    profileActivity.presentFragment(new o7c(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new v8(3));
                                    break;
                                }
                        }
                    }
                });
            }
            i++;
        }
    }
}
