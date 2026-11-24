// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yb2 {
    public final a8 a;
    public final a8 b;
    public final a8 c;
    public final a8 d;
    public final a8 e;
    public final wb2 f;
    public final int g;
    public m8 h;
    public final xb2 i;
    public long j;
    public int k;
    public int l;
    public final FrameLayout m;
    public final TextView n;
    public boolean o;

    public yb2(Context context, int i, rf8 rf8Var, boolean z, final xb2 xb2Var, wjb wjbVar) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        final byte b;
        Integer num;
        this.g = i;
        this.i = xb2Var;
        wb2 wb2Var = new wb2(context, z ? R.drawable.popup_fixed_alert : 0, wjbVar, 0, (byte) 0);
        wb2Var.V = new Path();
        this.f = wb2Var;
        wb2Var.setFitItems(true);
        if (rf8Var != null) {
            num = 1;
            actionBarPopupWindow$ActionBarPopupWindowLayout = wb2Var;
            b = 1;
            a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, k96.M0(2131753753, null), false, wjbVar);
            this.a = c;
            c.setOnClickListener(new w60(rf8Var, (byte) 1));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout = wb2Var;
            b = 1;
            num = 1;
        }
        a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_tone_on, k96.M0(2131745083, null), false, wjbVar);
        this.b = c2;
        final byte b2 = 0;
        c2.setOnClickListener(new View.OnClickListener(this) { // from class: ub2
            public final /* synthetic */ yb2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b3) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        break;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        break;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        break;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        break;
                    case 4:
                        yb2Var.a();
                        gl.c3(new hq1(xb2Var2, (byte) 22));
                        break;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        break;
                }
            }
        });
        a8 c3 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, k96.M0(2131748119, null), false, wjbVar);
        this.d = c3;
        c3.setOnClickListener(new View.OnClickListener(this) { // from class: ub2
            public final /* synthetic */ yb2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b3) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        break;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        break;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        break;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        break;
                    case 4:
                        yb2Var.a();
                        gl.c3(new hq1(xb2Var2, (byte) 22));
                        break;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        break;
                }
            }
        });
        a8 c4 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_1h, k96.M0(2131748119, null), false, wjbVar);
        this.e = c4;
        final byte b3 = 2;
        c4.setOnClickListener(new View.OnClickListener(this) { // from class: ub2
            public final /* synthetic */ yb2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b32) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        break;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        break;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        break;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        break;
                    case 4:
                        yb2Var.a();
                        gl.c3(new hq1(xb2Var2, (byte) 22));
                        break;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        break;
                }
            }
        });
        Integer num2 = num;
        byte b4 = b;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_mute_period, k96.M0(2131748116, null), false, wjbVar).setOnClickListener(new vb2(this, context, wjbVar, i, xb2Var, (byte) 0));
        final byte b5 = 3;
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, k96.M0(2131747724, null), false, wjbVar).setOnClickListener(new View.OnClickListener(this) { // from class: ub2
            public final /* synthetic */ yb2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b5;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b32) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        break;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        break;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        break;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        break;
                    case 4:
                        yb2Var.a();
                        gl.c3(new hq1(xb2Var2, (byte) 22));
                        break;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        break;
                }
            }
        });
        a8 c5 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, "", false, wjbVar);
        this.c = c5;
        final byte b6 = 4;
        c5.setOnClickListener(new View.OnClickListener(this) { // from class: ub2
            public final /* synthetic */ yb2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b6;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b32) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        break;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        break;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        break;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        break;
                    case 4:
                        yb2Var.a();
                        gl.c3(new hq1(xb2Var2, (byte) 22));
                        break;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        zkb.h(bkb.G8, wjbVar, frameLayout);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, nme.o(-1, 8));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setPadding(gl.L(13.0f), gl.L(8.0f), gl.L(13.0f), gl.L(8.0f));
        textView.setTextSize(b4, 13.0f);
        zkb.X(textView, bkb.D8, wjbVar);
        frameLayout.setTag(R.id.fit_width_tag, num2);
        textView.setTag(R.id.fit_width_tag, num2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, nme.o(-2, -2));
        int i2 = bkb.H5;
        ff0 Y = bkb.Y(bkb.v0(i2, wjbVar), 0, 6);
        vkb M = zkb.M(i2);
        textView.setBackground(Y);
        zkb.j(textView, Y, null, M, wjbVar);
        final byte b7 = 5;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: ub2
            public final /* synthetic */ yb2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b7;
                xb2 xb2Var2 = xb2Var;
                yb2 yb2Var = this.b;
                switch (b32) {
                    case 0:
                        yb2Var.a();
                        xb2Var2.n();
                        break;
                    case 1:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.l);
                        break;
                    case 2:
                        yb2Var.a();
                        xb2Var2.p(yb2Var.k);
                        break;
                    case 3:
                        yb2Var.a();
                        xb2Var2.l();
                        break;
                    case 4:
                        yb2Var.a();
                        gl.c3(new hq1(xb2Var2, (byte) 22));
                        break;
                    default:
                        xb2Var2.a();
                        yb2Var.a();
                        break;
                }
            }
        });
    }

    public static String b(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 86400;
        int i3 = i - (86400 * i2);
        int i4 = i3 / 3600;
        int i5 = (i3 - (i4 * 3600)) / 60;
        if (i2 != 0) {
            sb.append(i2);
            sb.append(k96.M0(2131745500, null));
        }
        if (i4 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i4);
            sb.append(k96.M0(2131745499, null));
        }
        if (i5 != 0) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i5);
            sb.append(k96.M0(2131745498, null));
        }
        return k96.a0("MuteForButton", null, 2131748117, sb.toString());
    }

    public static void c(a8 a8Var, int i) {
        int w0 = bkb.w0(null, i, false);
        a8Var.c(i, i);
        a8Var.h(0.1f, i);
        if (a8Var.getTextView() == null || a8Var.getTextView().getCurrentTextColor() != w0) {
            a8Var.d(w0, w0);
            a8Var.setSelectorColor(bkb.p1(0.1f, w0));
        }
    }

    public final void a() {
        m8 m8Var = this.h;
        if (m8Var != null) {
            m8Var.d(true);
            this.h.d(true);
        }
        this.i.dismiss();
        this.j = System.currentTimeMillis();
    }

    public final void d(d dVar, View view, float f, float f2, boolean z) {
        float measuredWidth;
        float measuredHeight;
        if (dVar.getFragmentView() != null) {
            wb2 wb2Var = this.f;
            m8 m8Var = new m8(wb2Var, -2, -2);
            this.h = m8Var;
            m8Var.e = true;
            m8Var.c = (short) 220;
            m8Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(R.style.PopupContextAnimation);
            this.h.setFocusable(true);
            wb2Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != dVar.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f += view.getX();
                f2 += view.getY();
                view = (View) view.getParent();
            }
            if (z) {
                measuredWidth = f - gl.N(8.0f);
                measuredHeight = gl.N(16.0f);
            } else {
                measuredWidth = f - (wb2Var.getMeasuredWidth() / 2.0f);
                measuredHeight = wb2Var.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(dVar.getFragmentView(), 0, (int) measuredWidth, (int) (f2 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j, long j2, HashSet hashSet) {
        int i;
        int i2;
        int i3;
        if (System.currentTimeMillis() - this.j < 200) {
            gl.c3(new n30((Object) this, j, j2, (Object) hashSet, (byte) 1));
            return;
        }
        int i4 = this.g;
        boolean n2 = na7.q1(i4).n2(j, j2, null);
        a8 a8Var = this.c;
        a8 a8Var2 = this.b;
        if (n2) {
            a8Var.j(k96.M0(2131743609, null), R.drawable.msg_unmute, null);
            i = bkb.w6;
            a8Var2.setVisibility(8);
        } else {
            a8Var.j(k96.M0(2131748114, null), R.drawable.msg_mute, null);
            int i5 = bkb.p7;
            a8Var2.setVisibility(0);
            if (na7.q1(i4).o2(j, j2)) {
                a8Var2.j(k96.M0(2131745085, null), R.drawable.msg_tone_off, null);
            } else {
                a8Var2.j(k96.M0(2131745083, null), R.drawable.msg_tone_on, null);
            }
            i = i5;
        }
        if (this.o) {
            this.a.setVisibility(8);
        }
        if (n2 || this.o) {
            i2 = 0;
            i3 = 0;
        } else {
            SharedPreferences sharedPreferences = na7.q1(i4).W3;
            i3 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i2 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        }
        a8 a8Var3 = this.d;
        if (i3 != 0) {
            this.l = i3;
            a8Var3.setVisibility(0);
            a8Var3.getImageView().setImageDrawable(rob.a(i3));
            a8Var3.setText(b(i3));
        } else {
            a8Var3.setVisibility(8);
        }
        a8 a8Var4 = this.e;
        if (i2 != 0) {
            this.k = i2;
            a8Var4.setVisibility(0);
            a8Var4.getImageView().setImageDrawable(rob.a(i2));
            a8Var4.setText(b(i2));
        } else {
            a8Var4.setVisibility(8);
        }
        c(a8Var, i);
        FrameLayout frameLayout = this.m;
        TextView textView = this.n;
        if (hashSet == null || hashSet.isEmpty()) {
            frameLayout.setVisibility(8);
            textView.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(gl.N2(k96.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), bkb.m6, 1, null, null));
        }
    }
}
