// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zi2 extends nx0 {
    public final Drawable l1;
    public final ArrayList m1;
    public final wi2 n1;
    public final yi2 o1;
    public final boolean p1;
    public int q1;
    public final int[] r1;
    public final byte s1;
    public int t1;
    public boolean u1;
    public gf1 v1;
    public int w1;
    public int x1;
    public int y1;

    public zi2(Activity activity, TLRPC.Chat chat) {
        super(1, (vnb) null, (Context) activity, false);
        ArrayList arrayList = new ArrayList();
        this.m1 = arrayList;
        int i = 2;
        this.r1 = new int[2];
        this.p1 = true;
        this.w0 = false;
        TLRPC.ChatFull N0 = uc7.s1(this.a).N0(chat.id);
        int i2 = N0 != null ? N0.ttl_period : 0;
        if (i2 == 0) {
            this.s1 = (byte) 0;
            this.t1 = 0;
            i = 0;
        } else if (i2 == 86400) {
            this.s1 = (byte) 1;
            this.t1 = 1;
            i = 1;
        } else if (i2 == 604800) {
            this.s1 = (byte) 2;
            this.t1 = 2;
        } else {
            i = 3;
            this.s1 = (byte) 3;
            this.t1 = 3;
        }
        Drawable mutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.l1 = mutate;
        int i3 = aob.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(aob.v0(i3, this.J0), PorterDuff.Mode.MULTIPLY));
        vi2 vi2Var = new vi2(this, activity);
        vi2Var.setFillViewport(true);
        vi2Var.setWillNotDraw(false);
        vi2Var.setClipToPadding(false);
        int i4 = this.u0;
        vi2Var.setPadding(i4, 0, i4, 0);
        this.b = vi2Var;
        wi2 wi2Var = new wi2(this, activity);
        this.n1 = wi2Var;
        wi2Var.setOrientation(1);
        vi2Var.addView(wi2Var, tre.x(-1, -2, 80));
        this.O = wi2Var;
        yac.h(this.a).e();
        uc7.s1(this.a);
        e29 e29Var = new e29(activity);
        e29Var.setAutoRepeat(false);
        e29Var.f(R.raw.utyan_private, jn7.E1, jn7.E1, null);
        e29Var.setPadding(0, hl.L(20.0f), 0, 0);
        e29Var.d();
        wi2Var.addView(e29Var, tre.t(jn7.p2, jn7.p2, 49, 17, 0, 17, 0));
        TextView textView = new TextView(activity);
        ik8.v(textView, 1, 24.0f);
        ik8.x(textView, aob.j5, null, null, 2131753862);
        wi2Var.addView(textView, tre.t(-2, -2, 49, 17, 18, 17, 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, aob.r5, null);
        textView2.setGravity(1);
        if (!xc2.T(chat) || chat.megagroup) {
            textView2.setText(ob6.M0(2131753863, null));
        } else {
            textView2.setText(ob6.M0(2131753864, null));
        }
        wi2Var.addView(textView2, tre.t(-2, -2, 49, 30, 22, 30, 20));
        zma zmaVar = new zma(activity, null);
        zmaVar.setCallback(new xi2(this, vi2Var));
        zmaVar.b(i, null, ob6.M0(2131753842, null), ob6.M0(2131753872, null), ob6.M0(2131753871, null), ob6.M0(2131753873, null));
        wi2Var.addView(zmaVar, tre.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(activity);
        zm2 zm2Var = new zm2(new ColorDrawable(aob.v0(aob.a7, this.J0)), aob.W0(activity, R.drawable.greydivider_bottom, aob.b7));
        zm2Var.x = true;
        frameLayout.setBackgroundDrawable(zm2Var);
        arrayList.add(zm2Var);
        wi2Var.addView(frameLayout, tre.o(-1, -2));
        ilb ilbVar = new ilb(activity, null);
        ilbVar.setText(ob6.M0(2131753845, null));
        frameLayout.addView(ilbVar);
        yi2 yi2Var = new yi2(activity);
        this.o1 = yi2Var;
        yob.h(i3, null, yi2Var);
        yi2Var.setText(ob6.M0(2131753838, null));
        yi2Var.a.setOnClickListener(new r81(this, (byte) 15));
        frameLayout.addView(yi2Var);
        F0(false);
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    public final void E0() {
        View childAt = this.n1.getChildAt(0);
        int[] iArr = this.r1;
        childAt.getLocationInWindow(iArr);
        int max = Math.max(iArr[1] - hl.L(this.p1 ? 6.0f : 19.0f), 0);
        if (this.q1 != max) {
            this.q1 = max;
            this.b.invalidate();
        }
    }

    public final void F0(boolean z) {
        byte b = this.s1;
        int i = this.t1;
        yi2 yi2Var = this.o1;
        if (b != i || this.p1) {
            yi2Var.setVisibility(0);
            if (z) {
                yi2Var.animate().alpha(1.0f).setDuration(180L).start();
                return;
            } else {
                yi2Var.setAlpha(1.0f);
                return;
            }
        }
        if (z) {
            yi2Var.animate().alpha(0.0f).setDuration(180L).start();
        } else {
            yi2Var.setVisibility(4);
            yi2Var.setAlpha(0.0f);
        }
    }

    @Override // nx0
    public final void p0() {
        ArrayList arrayList = this.m1;
        try {
            super.p0();
            int v0 = aob.v0(aob.a7, this.J0);
            int v02 = aob.v0(aob.b7, this.J0);
            if (v0 != this.x1 || v02 != this.y1) {
                this.x1 = v0;
                this.y1 = v02;
                for (int i = 0; i < arrayList.size(); i++) {
                    zm2 zm2Var = (zm2) arrayList.get(i);
                    aob.z1(zm2Var, v0, false);
                    if (zm2Var.b != null) {
                        aob.z1(zm2Var, v02, true);
                    }
                    zm2Var.invalidateSelf();
                }
            }
            int v03 = aob.v0(aob.h5, this.J0);
            Drawable drawable = this.l1;
            if (drawable == null || v03 == this.w1) {
                return;
            }
            this.w1 = v03;
            drawable.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
