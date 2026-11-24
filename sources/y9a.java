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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y9a extends LinearLayout implements vlb {
    public final ylb a;
    public final pc0 b;
    public final bf0 c;
    public final lka d;
    public final TextView e;
    public final ImageView f;
    public final tm h;
    public final tm n;
    public int r;

    public y9a(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        setOrientation(0);
        this.b = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(14.0f));
        lka lkaVar = new lka(context);
        this.d = lkaVar;
        lkaVar.setTextSize(15);
        lkaVar.setTypeface(gm.o());
        anb.W(lkaVar, cmb.F6, ylbVar);
        this.h = new tm(gm.L(24.0f), 7, lkaVar, false);
        this.n = new tm(gm.L(24.0f), 7, lkaVar, false);
        lkaVar.addOnAttachStateChangeListener(new wd(this, (byte) 17));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(gm.L(6.66f), 0, gm.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        anb.X(textView, cmb.Ii, ylbVar);
        int L = gm.L(10.0f);
        int i = cmb.Ei;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        textView.setBackground(b0);
        anb.j(textView, b0, M, null, ylbVar);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.l6, ylbVar, PorterDuff.Mode.SRC_IN);
        if (!jb6.a0) {
            lkaVar.setGravity(19);
            addView(bf0Var, qoe.t(28, 28, 19, 18, 0, 18, 0));
            addView(lkaVar, qoe.q(0, -1, 1.0f, nm7.D1, 0, 0, 18, 0));
            addView(textView, qoe.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, qoe.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        lkaVar.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, qoe.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, qoe.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(lkaVar, qoe.q(0, -1, 1.0f, nm7.D1, 18, 0, 0, 0));
        addView(bf0Var, qoe.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.pi));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
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
        TLRPC.User f = z8c.h(i).f();
        pc0 pc0Var = this.b;
        pc0Var.q(f);
        bf0 bf0Var = this.c;
        bf0Var.getImageReceiver().d = i;
        bf0Var.f(f, pc0Var);
        String r = m9c.r(f);
        lka lkaVar = this.d;
        lkaVar.l(r, false);
        Integer valueOf = Integer.valueOf(i);
        tm tmVar = this.h;
        tmVar.y = valueOf;
        Integer valueOf2 = Integer.valueOf(i);
        tm tmVar2 = this.n;
        tmVar2.y = valueOf2;
        int i3 = cmb.pi;
        ylb ylbVar = this.a;
        tmVar.k(Integer.valueOf(cmb.v0(i3, ylbVar)));
        if (f != null) {
            long j = f.bot_verification_icon;
            if (j != 0) {
                tmVar.j(j, false);
                i2 = m9c.i(f);
                tmVar2.k(Integer.valueOf(cmb.v0(i3, ylbVar)));
                if (i2 == null) {
                    tmVar2.j(i2.longValue(), false);
                } else if (f == null || !f.premium) {
                    tmVar2.g(null, false);
                } else {
                    tmVar2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (tmVar.d()) {
                    tmVar = null;
                }
                lkaVar.setLeftDrawable(tmVar);
                if (tmVar2.d()) {
                    tmVar2 = null;
                }
                lkaVar.i(tmVar2);
                int i4 = cf7.Y(i).L;
                int i5 = i4 <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i5);
                textView.setText(jb6.E(i4, ','));
            }
        }
        tmVar.g(null, false);
        i2 = m9c.i(f);
        tmVar2.k(Integer.valueOf(cmb.v0(i3, ylbVar)));
        if (i2 == null) {
        }
        if (tmVar.d()) {
        }
        lkaVar.setLeftDrawable(tmVar);
        if (tmVar2.d()) {
        }
        lkaVar.i(tmVar2);
        int i42 = cf7.Y(i).L;
        if (i42 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i5);
        textView2.setText(jb6.E(i42, ','));
    }

    @Override // vlb
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.a;
        int v0 = cmb.v0(i, ylbVar);
        lka lkaVar = this.d;
        lkaVar.setTextColor(v0);
        TextView textView = this.e;
        cmb.A1(cmb.v0(cmb.Ei, ylbVar), textView.getBackground());
        textView.invalidate();
        int v02 = cmb.v0(cmb.l6, ylbVar);
        int i2 = this.r;
        ImageView imageView = this.f;
        if (v02 != i2 || imageView.getColorFilter() == null) {
            this.r = v02;
            imageView.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        }
        int i3 = cmb.pi;
        this.n.k(Integer.valueOf(cmb.v0(i3, ylbVar)));
        try {
            tm tmVar = this.h;
            if (tmVar != null) {
                tmVar.k(Integer.valueOf(cmb.v0(i3, ylbVar)));
                lkaVar.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
