// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y7a extends LinearLayout implements tjb {
    public final wjb a;
    public final pb0 b;
    public final be0 c;
    public final jia d;
    public final TextView e;
    public final ImageView f;
    public final tl h;
    public final tl n;
    public int r;

    public y7a(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        setOrientation(0);
        this.b = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(14.0f));
        jia jiaVar = new jia(context);
        this.d = jiaVar;
        jiaVar.setTextSize(15);
        jiaVar.setTypeface(gl.o());
        zkb.W(jiaVar, bkb.F6, wjbVar);
        this.h = new tl(gl.L(24.0f), 7, jiaVar, false);
        this.n = new tl(gl.L(24.0f), 7, jiaVar, false);
        jiaVar.addOnAttachStateChangeListener(new wc(this, (byte) 17));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(gl.L(6.66f), 0, gl.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        zkb.X(textView, bkb.Ii, wjbVar);
        int L = gl.L(10.0f);
        int i = bkb.Ei;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        textView.setBackground(b0);
        zkb.j(textView, b0, M, null, wjbVar);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.l6, wjbVar, PorterDuff.Mode.SRC_IN);
        if (!k96.a0) {
            jiaVar.setGravity(19);
            addView(be0Var, nme.t(28, 28, 19, 18, 0, 18, 0));
            addView(jiaVar, nme.q(0, -1, 1.0f, kk7.D1, 0, 0, 18, 0));
            addView(textView, nme.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, nme.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        jiaVar.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, nme.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, nme.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(jiaVar, nme.q(0, -1, 1.0f, kk7.D1, 18, 0, 0, 0));
        addView(be0Var, nme.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.pi));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(int i) {
        Long i2;
        TLRPC.User f = y6c.h(i).f();
        pb0 pb0Var = this.b;
        pb0Var.q(f);
        be0 be0Var = this.c;
        be0Var.getImageReceiver().d = i;
        be0Var.f(f, pb0Var);
        String r = l7c.r(f);
        jia jiaVar = this.d;
        jiaVar.l(r, false);
        Integer valueOf = Integer.valueOf(i);
        tl tlVar = this.h;
        tlVar.y = valueOf;
        Integer valueOf2 = Integer.valueOf(i);
        tl tlVar2 = this.n;
        tlVar2.y = valueOf2;
        int i3 = bkb.pi;
        wjb wjbVar = this.a;
        tlVar.k(Integer.valueOf(bkb.v0(i3, wjbVar)));
        if (f != null) {
            long j = f.bot_verification_icon;
            if (j != 0) {
                tlVar.j(j, false);
                i2 = l7c.i(f);
                tlVar2.k(Integer.valueOf(bkb.v0(i3, wjbVar)));
                if (i2 == null) {
                    tlVar2.j(i2.longValue(), false);
                } else if (f == null || !f.premium) {
                    tlVar2.g(null, false);
                } else {
                    tlVar2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (tlVar.d()) {
                    tlVar = null;
                }
                jiaVar.setLeftDrawable(tlVar);
                if (tlVar2.d()) {
                    tlVar2 = null;
                }
                jiaVar.i(tlVar2);
                int i4 = ad7.Y(i).L;
                int i5 = i4 <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i5);
                textView.setText(k96.E(i4, ','));
            }
        }
        tlVar.g(null, false);
        i2 = l7c.i(f);
        tlVar2.k(Integer.valueOf(bkb.v0(i3, wjbVar)));
        if (i2 == null) {
        }
        if (tlVar.d()) {
        }
        jiaVar.setLeftDrawable(tlVar);
        if (tlVar2.d()) {
        }
        jiaVar.i(tlVar2);
        int i42 = ad7.Y(i).L;
        if (i42 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i5);
        textView2.setText(k96.E(i42, ','));
    }

    @Override // tjb
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.a;
        int v0 = bkb.v0(i, wjbVar);
        jia jiaVar = this.d;
        jiaVar.setTextColor(v0);
        TextView textView = this.e;
        bkb.A1(bkb.v0(bkb.Ei, wjbVar), textView.getBackground());
        textView.invalidate();
        int v02 = bkb.v0(bkb.l6, wjbVar);
        int i2 = this.r;
        ImageView imageView = this.f;
        if (v02 != i2 || imageView.getColorFilter() == null) {
            this.r = v02;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        }
        int i3 = bkb.pi;
        this.n.k(Integer.valueOf(bkb.v0(i3, wjbVar)));
        try {
            tl tlVar = this.h;
            if (tlVar != null) {
                tlVar.k(Integer.valueOf(bkb.v0(i3, wjbVar)));
                jiaVar.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
