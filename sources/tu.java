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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tu extends View implements eib {
    public TL_iv.pageBlockEmbedPost E;
    public final vg5 a;
    public final dx b;
    public final ImageReceiver c;
    public final pb0 d;
    public bw e;
    public bw f;
    public bw h;
    public bw n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    public tu(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.q0(gl.L(20.0f));
        imageReceiver.i0(gl.L(32.0f), gl.L(8.0f), gl.L(40.0f), gl.L(40.0f));
        this.d = new pb0((wjb) null);
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        bw bwVar = this.f;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.e;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
        bw bwVar3 = this.h;
        if (bwVar3 != null) {
            arrayList.add(bwVar3);
        }
        bw bwVar4 = this.n;
        if (bwVar4 != null) {
            arrayList.add(bwVar4);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.f;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.e;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
        bw bwVar3 = this.h;
        if (bwVar3 != null) {
            bwVar3.i(this);
        }
        bw bwVar4 = this.n;
        if (bwVar4 != null) {
            bwVar4.i(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.f;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.e;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
        bw bwVar3 = this.h;
        if (bwVar3 != null) {
            bwVar3.f(this);
        }
        bw bwVar4 = this.n;
        if (bwVar4 != null) {
            bwVar4.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        if (pageblockembedpost != null) {
            boolean z = pageblockembedpost instanceof uw;
            vg5 vg5Var = this.a;
            if (z) {
                canvas2 = canvas;
            } else {
                if (this.r) {
                    this.c.h(canvas, null);
                }
                if (this.f != null) {
                    canvas.save();
                    canvas.translate(gl.L((this.r ? 54 : 0) + 32), gl.L(this.e != null ? 10.0f : 19.0f));
                    o.s(vg5Var, canvas, this, 0);
                    this.f.d(canvas, this);
                    canvas.restore();
                    i = 1;
                } else {
                    i = 0;
                }
                if (this.e != null) {
                    canvas.save();
                    canvas.translate(gl.L((this.r ? 54 : 0) + 32), gl.L(29.0f));
                    o.s(vg5Var, canvas, this, i);
                    this.e.d(canvas, this);
                    canvas.restore();
                    i++;
                }
                canvas2 = canvas;
                canvas2.drawRect(gl.L(18.0f), gl.L(6.0f), gl.L(20.0f), this.y - (this.E.level == 0 ? gl.L(6.0f) : 0), o.s1);
                r2 = i;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.s, this.w);
                o.s(vg5Var, canvas2, this, r2);
                this.h.d(canvas2, this);
                canvas2.restore();
                r2++;
            }
            if (this.n != null) {
                canvas2.save();
                canvas2.translate(this.s, this.w + this.x);
                o.s(vg5Var, canvas2, this, r2);
                this.n.d(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(k96.M0(2131754866, null));
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
        bw bwVar;
        bw n;
        bw bwVar2;
        bw bwVar3;
        bw bwVar4;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.E;
        int i3 = 1;
        if (pageblockembedpost != null) {
            boolean z = pageblockembedpost instanceof uw;
            dx dxVar = this.b;
            if (z) {
                this.s = gl.L(18.0f);
                this.w = gl.L(4.0f);
                int L = size - gl.L(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.E;
                bw m = o.m(this.a, this, null, pageblockembedpost2.caption.text, L, this.w, pageblockembedpost2, this.b);
                this.h = m;
                if (m != null) {
                    int height = this.h.d.getHeight() + gl.L(4.0f);
                    this.x = height;
                    r14 = gl.L(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.E;
                bw n2 = o.n(this.a, this, null, pageblockembedpost3.caption.credit, L, 0, pageblockembedpost3, dxVar.H ? lwa.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
                this.n = n2;
                if (n2 != null) {
                    r14 += this.n.d.getHeight() + gl.L(4.0f);
                }
                i3 = r14;
            } else {
                long j = pageblockembedpost.author_photo_id;
                boolean z2 = j != 0;
                this.r = z2;
                if (z2) {
                    TLRPC.Photo e = cx.e(dxVar.F, j);
                    boolean z3 = e instanceof TLRPC.TL_photo;
                    this.r = z3;
                    if (z3) {
                        String str = this.E.author;
                        pb0 pb0Var = this.d;
                        pb0Var.j(0L, str, null, null);
                        bwVar = null;
                        this.c.c0(gl5.i(ba4.w(e.sizes, gl.L(40.0f), true, null, false), e), "40_40", pb0Var, 0L, null, dxVar.F, 1);
                        String str2 = this.E.author;
                        int L2 = size - gl.L((!this.r ? 54 : 0) + 50);
                        TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.E;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        bw bwVar5 = bwVar;
                        n = o.n(this.a, this, str2, null, L2, 0, pageblockembedpost4, alignment, 1, this.b);
                        this.f = n;
                        if (n != null) {
                            n.s = gl.L((this.r ? 54 : 0) + 32);
                            this.f.w = gl.L(this.e != null ? 10.0f : 19.0f);
                        }
                        if (this.E.date == 0) {
                            this.e = o.m(this.a, this, k96.D0().h0().format(this.E.date * 1000), null, size - gl.L((this.r ? 54 : 0) + 50), gl.L(29.0f), this.E, this.b);
                        } else {
                            this.e = bwVar5;
                        }
                        int L3 = gl.L(56.0f);
                        if (this.E.blocks.isEmpty()) {
                            this.h = bwVar5;
                            this.n = bwVar5;
                        } else {
                            this.s = gl.L(32.0f);
                            this.w = gl.L(56.0f);
                            int L4 = size - gl.L(50.0f);
                            TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.E;
                            bw m2 = o.m(this.a, this, null, pageblockembedpost5.caption.text, L4, this.w, pageblockembedpost5, this.b);
                            this.h = m2;
                            if (m2 != null) {
                                int height2 = this.h.d.getHeight() + gl.L(4.0f);
                                this.x = height2;
                                L3 = de9.w(4.0f, height2, L3);
                            }
                            int i4 = L3;
                            TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.E;
                            bw n3 = o.n(this.a, this, null, pageblockembedpost6.caption.credit, L4, 0, pageblockembedpost6, dxVar.H ? lwa.a() : alignment, 0, this.b);
                            this.n = n3;
                            L3 = n3 != null ? this.n.d.getHeight() + gl.L(4.0f) + i4 : i4;
                        }
                        bwVar2 = this.e;
                        if (bwVar2 != null) {
                            bwVar2.s = gl.L((this.r ? 54 : 0) + 32);
                            this.e.w = gl.L(29.0f);
                        }
                        bwVar3 = this.h;
                        if (bwVar3 != null) {
                            bwVar3.s = this.s;
                            bwVar3.w = this.w;
                        }
                        bwVar4 = this.n;
                        if (bwVar4 != null) {
                            bwVar4.s = this.s;
                            bwVar4.w = this.w;
                        }
                        i3 = L3;
                    }
                }
                bwVar = null;
                String str22 = this.E.author;
                int L22 = size - gl.L((!this.r ? 54 : 0) + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost42 = this.E;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                bw bwVar52 = bwVar;
                n = o.n(this.a, this, str22, null, L22, 0, pageblockembedpost42, alignment2, 1, this.b);
                this.f = n;
                if (n != null) {
                }
                if (this.E.date == 0) {
                }
                int L32 = gl.L(56.0f);
                if (this.E.blocks.isEmpty()) {
                }
                bwVar2 = this.e;
                if (bwVar2 != null) {
                }
                bwVar3 = this.h;
                if (bwVar3 != null) {
                }
                bwVar4 = this.n;
                if (bwVar4 != null) {
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
