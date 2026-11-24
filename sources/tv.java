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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tv extends View implements fkb {
    public TL_iv.pageBlockEmbedPost E;
    public final ui5 a;
    public final ey b;
    public final ImageReceiver c;
    public final pc0 d;
    public bx e;
    public bx f;
    public bx h;
    public bx n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public tv(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.q0(gm.L(20.0f));
        imageReceiver.i0(gm.L(32.0f), gm.L(8.0f), gm.L(40.0f), gm.L(40.0f));
        this.d = new pc0((ylb) null);
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        bx bxVar = this.f;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.e;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
        bx bxVar3 = this.h;
        if (bxVar3 != null) {
            arrayList.add(bxVar3);
        }
        bx bxVar4 = this.n;
        if (bxVar4 != null) {
            arrayList.add(bxVar4);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.f;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.e;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
        bx bxVar3 = this.h;
        if (bxVar3 != null) {
            bxVar3.i(this);
        }
        bx bxVar4 = this.n;
        if (bxVar4 != null) {
            bxVar4.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.f;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.e;
        if (bxVar2 != null) {
            bxVar2.f(this);
        }
        bx bxVar3 = this.h;
        if (bxVar3 != null) {
            bxVar3.f(this);
        }
        bx bxVar4 = this.n;
        if (bxVar4 != null) {
            bxVar4.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        if (pageblockembedpost != null) {
            boolean z = pageblockembedpost instanceof ux;
            ui5 ui5Var = this.a;
            if (z) {
                canvas2 = canvas;
            } else {
                if (this.r) {
                    this.c.h(canvas, null);
                }
                if (this.f != null) {
                    canvas.save();
                    canvas.translate(gm.L((this.r ? 54 : 0) + 32), gm.L(this.e != null ? 10.0f : 19.0f));
                    o.s(ui5Var, canvas, this, 0);
                    this.f.d(canvas, this);
                    canvas.restore();
                    i = 1;
                } else {
                    i = 0;
                }
                if (this.e != null) {
                    canvas.save();
                    canvas.translate(gm.L((this.r ? 54 : 0) + 32), gm.L(29.0f));
                    o.s(ui5Var, canvas, this, i);
                    this.e.d(canvas, this);
                    canvas.restore();
                    i++;
                }
                canvas2 = canvas;
                canvas2.drawRect(gm.L(18.0f), gm.L(6.0f), gm.L(20.0f), this.y - (this.E.level == 0 ? gm.L(6.0f) : 0), o.s1);
                r2 = i;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.s, this.w);
                o.s(ui5Var, canvas2, this, r2);
                this.h.d(canvas2, this);
                canvas2.restore();
                r2++;
            }
            if (this.n != null) {
                canvas2.save();
                canvas2.translate(this.s, this.w + this.x);
                o.s(ui5Var, canvas2, this, r2);
                this.n.d(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(jb6.M0(2131754866, null));
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
        bx bxVar;
        bx n;
        bx bxVar2;
        bx bxVar3;
        bx bxVar4;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        int i3 = 1;
        if (pageblockembedpost != null) {
            boolean z = pageblockembedpost instanceof ux;
            ey eyVar = this.b;
            if (z) {
                this.s = gm.L(18.0f);
                this.w = gm.L(4.0f);
                int L = size - gm.L(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.E;
                bx m = o.m(this.a, this, null, pageblockembedpost2.caption.text, L, this.w, pageblockembedpost2, this.b);
                this.h = m;
                if (m != null) {
                    int height = this.h.d.getHeight() + gm.L(4.0f);
                    this.x = height;
                    r14 = gm.L(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.E;
                bx n2 = o.n(this.a, this, null, pageblockembedpost3.caption.credit, L, 0, pageblockembedpost3, eyVar.H ? oya.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
                this.n = n2;
                if (n2 != null) {
                    r14 += this.n.d.getHeight() + gm.L(4.0f);
                }
                i3 = r14;
            } else {
                long j = pageblockembedpost.author_photo_id;
                boolean z2 = j != 0;
                this.r = z2;
                if (z2) {
                    TLRPC.Photo e = dy.e(eyVar.F, j);
                    boolean z3 = e instanceof TLRPC.TL_photo;
                    this.r = z3;
                    if (z3) {
                        String str = this.E.author;
                        pc0 pc0Var = this.d;
                        pc0Var.j(0L, str, null, null);
                        bxVar = null;
                        this.c.c0(gn5.i(bc4.w(e.sizes, gm.L(40.0f), true, null, false), e), "40_40", pc0Var, 0L, null, eyVar.F, 1);
                        String str2 = this.E.author;
                        int L2 = size - gm.L((!this.r ? 54 : 0) + 50);
                        TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.E;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        bx bxVar5 = bxVar;
                        n = o.n(this.a, this, str2, null, L2, 0, pageblockembedpost4, alignment, 1, this.b);
                        this.f = n;
                        if (n != null) {
                            n.s = gm.L((this.r ? 54 : 0) + 32);
                            this.f.w = gm.L(this.e != null ? 10.0f : 19.0f);
                        }
                        if (this.E.date == 0) {
                            this.e = o.m(this.a, this, jb6.D0().h0().format(this.E.date * 1000), null, size - gm.L((this.r ? 54 : 0) + 50), gm.L(29.0f), this.E, this.b);
                        } else {
                            this.e = bxVar5;
                        }
                        int L3 = gm.L(56.0f);
                        if (this.E.blocks.isEmpty()) {
                            this.h = bxVar5;
                            this.n = bxVar5;
                        } else {
                            this.s = gm.L(32.0f);
                            this.w = gm.L(56.0f);
                            int L4 = size - gm.L(50.0f);
                            TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.E;
                            bx m2 = o.m(this.a, this, null, pageblockembedpost5.caption.text, L4, this.w, pageblockembedpost5, this.b);
                            this.h = m2;
                            if (m2 != null) {
                                int height2 = this.h.d.getHeight() + gm.L(4.0f);
                                this.x = height2;
                                L3 = hg9.v(4.0f, height2, L3);
                            }
                            int i4 = L3;
                            TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.E;
                            bx n3 = o.n(this.a, this, null, pageblockembedpost6.caption.credit, L4, 0, pageblockembedpost6, eyVar.H ? oya.a() : alignment, 0, this.b);
                            this.n = n3;
                            L3 = n3 != null ? this.n.d.getHeight() + gm.L(4.0f) + i4 : i4;
                        }
                        bxVar2 = this.e;
                        if (bxVar2 != null) {
                            bxVar2.s = gm.L((this.r ? 54 : 0) + 32);
                            this.e.w = gm.L(29.0f);
                        }
                        bxVar3 = this.h;
                        if (bxVar3 != null) {
                            bxVar3.s = this.s;
                            bxVar3.w = this.w;
                        }
                        bxVar4 = this.n;
                        if (bxVar4 != null) {
                            bxVar4.s = this.s;
                            bxVar4.w = this.w;
                        }
                        i3 = L3;
                    }
                }
                bxVar = null;
                String str22 = this.E.author;
                int L22 = size - gm.L((!this.r ? 54 : 0) + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost42 = this.E;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                bx bxVar52 = bxVar;
                n = o.n(this.a, this, str22, null, L22, 0, pageblockembedpost42, alignment2, 1, this.b);
                this.f = n;
                if (n != null) {
                }
                if (this.E.date == 0) {
                }
                int L32 = gm.L(56.0f);
                if (this.E.blocks.isEmpty()) {
                }
                bxVar2 = this.e;
                if (bxVar2 != null) {
                }
                bxVar3 = this.h;
                if (bxVar3 != null) {
                }
                bxVar4 = this.n;
                if (bxVar4 != null) {
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
