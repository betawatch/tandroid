// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uu extends View implements zlb {
    public TL_iv.pageBlockEmbedPost E;
    public final xi5 a;
    public final ex b;
    public final ImageReceiver c;
    public final rb0 d;
    public cw e;
    public cw f;
    public cw h;
    public cw n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public uu(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.q0(hl.L(20.0f));
        imageReceiver.i0(hl.L(32.0f), hl.L(8.0f), hl.L(40.0f), hl.L(40.0f));
        this.d = new rb0((vnb) null);
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        cw cwVar = this.f;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        cw cwVar2 = this.e;
        if (cwVar2 != null) {
            arrayList.add(cwVar2);
        }
        cw cwVar3 = this.h;
        if (cwVar3 != null) {
            arrayList.add(cwVar3);
        }
        cw cwVar4 = this.n;
        if (cwVar4 != null) {
            arrayList.add(cwVar4);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.f;
        if (cwVar != null) {
            cwVar.i(this);
        }
        cw cwVar2 = this.e;
        if (cwVar2 != null) {
            cwVar2.i(this);
        }
        cw cwVar3 = this.h;
        if (cwVar3 != null) {
            cwVar3.i(this);
        }
        cw cwVar4 = this.n;
        if (cwVar4 != null) {
            cwVar4.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.f;
        if (cwVar != null) {
            cwVar.f(this);
        }
        cw cwVar2 = this.e;
        if (cwVar2 != null) {
            cwVar2.f(this);
        }
        cw cwVar3 = this.h;
        if (cwVar3 != null) {
            cwVar3.f(this);
        }
        cw cwVar4 = this.n;
        if (cwVar4 != null) {
            cwVar4.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        if (pageblockembedpost != null) {
            boolean z = pageblockembedpost instanceof vw;
            xi5 xi5Var = this.a;
            if (z) {
                canvas2 = canvas;
            } else {
                if (this.r) {
                    this.c.h(canvas, null);
                }
                if (this.f != null) {
                    canvas.save();
                    canvas.translate(hl.L((this.r ? 54 : 0) + 32), hl.L(this.e != null ? 10.0f : 19.0f));
                    o.s(xi5Var, canvas, this, 0);
                    this.f.d(canvas, this);
                    canvas.restore();
                    i = 1;
                } else {
                    i = 0;
                }
                if (this.e != null) {
                    canvas.save();
                    canvas.translate(hl.L((this.r ? 54 : 0) + 32), hl.L(29.0f));
                    o.s(xi5Var, canvas, this, i);
                    this.e.d(canvas, this);
                    canvas.restore();
                    i++;
                }
                canvas2 = canvas;
                canvas2.drawRect(hl.L(18.0f), hl.L(6.0f), hl.L(20.0f), this.y - (this.E.level == 0 ? hl.L(6.0f) : 0), o.s1);
                r2 = i;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.s, this.w);
                o.s(xi5Var, canvas2, this, r2);
                this.h.d(canvas2, this);
                canvas2.restore();
                r2++;
            }
            if (this.n != null) {
                canvas2.save();
                canvas2.translate(this.s, this.w + this.x);
                o.s(xi5Var, canvas2, this, r2);
                this.n.d(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(ob6.M0(2131754862, null));
        if (this.f != null) {
            sb.append(", ");
            sb.append(this.f.d.getText());
        }
        if (this.e != null) {
            sb.append(", ");
            sb.append(this.e.d.getText());
        }
        if (this.h != null) {
            sb.append(", ");
            sb.append(this.h.d.getText());
        }
        if (this.n != null) {
            sb.append(", ");
            sb.append(this.n.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        cw cwVar;
        cw n;
        cw cwVar2;
        cw cwVar3;
        cw cwVar4;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        int i3 = 1;
        if (pageblockembedpost != null) {
            boolean z = pageblockembedpost instanceof vw;
            ex exVar = this.b;
            if (z) {
                this.s = hl.L(18.0f);
                this.w = hl.L(4.0f);
                int L = size - hl.L(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.E;
                cw m = o.m(this.a, this, null, pageblockembedpost2.caption.text, L, this.w, pageblockembedpost2, this.b);
                this.h = m;
                if (m != null) {
                    int height = this.h.d.getHeight() + hl.L(4.0f);
                    this.x = height;
                    r14 = hl.L(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.E;
                cw n2 = o.n(this.a, this, null, pageblockembedpost3.caption.credit, L, 0, pageblockembedpost3, exVar.H ? o0b.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
                this.n = n2;
                if (n2 != null) {
                    r14 += this.n.d.getHeight() + hl.L(4.0f);
                }
                i3 = r14;
            } else {
                long j = pageblockembedpost.author_photo_id;
                boolean z2 = j != 0;
                this.r = z2;
                if (z2) {
                    TLRPC.Photo e = dx.e(exVar.F, j);
                    boolean z3 = e instanceof TLRPC.TL_photo;
                    this.r = z3;
                    if (z3) {
                        String str = this.E.author;
                        rb0 rb0Var = this.d;
                        rb0Var.j(0L, str, null, null);
                        cwVar = null;
                        this.c.c0(jn5.i(xb4.w(e.sizes, hl.L(40.0f), true, null, false), e), "40_40", rb0Var, 0L, null, exVar.F, 1);
                        String str2 = this.E.author;
                        int L2 = size - hl.L((!this.r ? 54 : 0) + 50);
                        TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.E;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        cw cwVar5 = cwVar;
                        n = o.n(this.a, this, str2, null, L2, 0, pageblockembedpost4, alignment, 1, this.b);
                        this.f = n;
                        if (n != null) {
                            n.s = hl.L((this.r ? 54 : 0) + 32);
                            this.f.w = hl.L(this.e != null ? 10.0f : 19.0f);
                        }
                        if (this.E.date == 0) {
                            this.e = o.m(this.a, this, ob6.D0().h0().format(this.E.date * 1000), null, size - hl.L((this.r ? 54 : 0) + 50), hl.L(29.0f), this.E, this.b);
                        } else {
                            this.e = cwVar5;
                        }
                        int L3 = hl.L(56.0f);
                        if (this.E.blocks.isEmpty()) {
                            this.h = cwVar5;
                            this.n = cwVar5;
                        } else {
                            this.s = hl.L(32.0f);
                            this.w = hl.L(56.0f);
                            int L4 = size - hl.L(50.0f);
                            TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.E;
                            cw m2 = o.m(this.a, this, null, pageblockembedpost5.caption.text, L4, this.w, pageblockembedpost5, this.b);
                            this.h = m2;
                            if (m2 != null) {
                                int height2 = this.h.d.getHeight() + hl.L(4.0f);
                                this.x = height2;
                                L3 = uh9.w(4.0f, height2, L3);
                            }
                            int i4 = L3;
                            TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.E;
                            cw n3 = o.n(this.a, this, null, pageblockembedpost6.caption.credit, L4, 0, pageblockembedpost6, exVar.H ? o0b.a() : alignment, 0, this.b);
                            this.n = n3;
                            L3 = n3 != null ? this.n.d.getHeight() + hl.L(4.0f) + i4 : i4;
                        }
                        cwVar2 = this.e;
                        if (cwVar2 != null) {
                            cwVar2.s = hl.L((this.r ? 54 : 0) + 32);
                            this.e.w = hl.L(29.0f);
                        }
                        cwVar3 = this.h;
                        if (cwVar3 != null) {
                            cwVar3.s = this.s;
                            cwVar3.w = this.w;
                        }
                        cwVar4 = this.n;
                        if (cwVar4 != null) {
                            cwVar4.s = this.s;
                            cwVar4.w = this.w;
                        }
                        i3 = L3;
                    }
                }
                cwVar = null;
                String str22 = this.E.author;
                int L22 = size - hl.L((!this.r ? 54 : 0) + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost42 = this.E;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                cw cwVar52 = cwVar;
                n = o.n(this.a, this, str22, null, L22, 0, pageblockembedpost42, alignment2, 1, this.b);
                this.f = n;
                if (n != null) {
                }
                if (this.E.date == 0) {
                }
                int L32 = hl.L(56.0f);
                if (this.E.blocks.isEmpty()) {
                }
                cwVar2 = this.e;
                if (cwVar2 != null) {
                }
                cwVar3 = this.h;
                if (cwVar3 != null) {
                }
                cwVar4 = this.n;
                if (cwVar4 != null) {
                }
                i3 = L32;
            }
            this.y = i3;
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (o.i(this.a, this.b, motionEvent, this, this.h, this.s, this.w)) {
            return true;
        }
        return o.i(this.a, this.b, motionEvent, this, this.n, this.s, this.w + this.x) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.E = pageblockembedpost;
        requestLayout();
    }
}
