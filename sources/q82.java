// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q82 extends a22 {
    public final r34 n;
    public final r59 r;
    public final byte s;
    public final js w;
    public int x;

    /* JADX WARN: Multi-variable type inference failed */
    public q82(int i, i22 i22Var, ylb ylbVar, Context context) {
        super(i22Var, ylbVar, context);
        this.s = i;
        r34 r34Var = new r34(context, ylbVar);
        this.n = r34Var;
        r34Var.setText(jb6.M0(2131747914, null));
        r34Var.setOnTouchListener(null);
        r34Var.setTextSize(16);
        addView(r34Var, qoe.c(-2.0f, -1));
        r34Var.a(R.raw.media_forbidden, nm7.f2, nm7.f2);
        TLRPC.Chat S0 = this.b.S0();
        byte b = 4;
        if (i == 1) {
            r34Var.setText(sd2.L(7, S0));
        } else if (i == 3) {
            r34Var.setText(sd2.L(18, S0));
        } else if (i == 4) {
            r34Var.setText(sd2.L(19, S0));
        } else {
            r34Var.setText(sd2.L(22, S0));
        }
        r34Var.c();
        r59 r59Var = new r59(context, ylbVar);
        this.r = r59Var;
        r59Var.setSectionsType(2);
        r59Var.setVerticalScrollBarEnabled(false);
        r59Var.setLayoutManager(new u46());
        r59Var.setClipToPadding(false);
        js jsVar = new js(this, b);
        this.w = jsVar;
        r59Var.setAdapter(jsVar);
        r59Var.setPadding(0, 0, 0, gm.L(48.0f));
        r59Var.setOnScrollListener(new y(this, (byte) 24));
        addView(r59Var, qoe.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // a22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, int i2) {
        int i3;
        int i4;
        r59 r59Var;
        int max = Math.max(0, i2 - a.getCurrentActionBarHeight());
        if (this.x != max) {
            this.x = max;
            this.w.f();
        }
        if (!gm.O1()) {
            Point point = gm.q;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
                int L = i3 - gm.L(52.0f);
                i4 = L >= 0 ? L : 0;
                r59Var = this.r;
                if (r59Var.getPaddingTop() == i4) {
                    r59Var.setPadding(gm.L(6.0f), i4, gm.L(6.0f), gm.L(48.0f));
                    return;
                }
                return;
            }
        }
        i3 = (i2 / 5) << 1;
        int L2 = i3 - gm.L(52.0f);
        if (L2 >= 0) {
        }
        r59Var = this.r;
        if (r59Var.getPaddingTop() == i4) {
        }
    }

    @Override // a22
    public int getCurrentItemTop() {
        r59 r59Var = this.r;
        if (r59Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i = 0;
        View childAt = r59Var.getChildAt(0);
        b59 b59Var = (b59) r59Var.G(childAt);
        int top = childAt.getTop() - gm.L(8.0f);
        if (top > 0 && b59Var != null && b59Var.b() == 0) {
            i = top;
        }
        if (top < 0 || b59Var == null || b59Var.b() != 0) {
            top = i;
        }
        int measuredHeight = (getMeasuredHeight() - top) - gm.L(50.0f);
        this.n.setTranslationY(((measuredHeight - r4.getMeasuredHeight()) / 2) + top);
        return gm.L(12.0f) + top;
    }

    @Override // a22
    public int getFirstOffset() {
        return gm.L(4.0f) + getListTopPadding();
    }

    @Override // a22
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }
}
