package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w1 extends View implements org.telegram.ui.Cells.m9 {
    public final a70 a;
    public final j4 b;
    public final ImageReceiver c;
    public final org.telegram.ui.Components.z8 d;
    public e3 e;
    public e3 f;
    public e3 h;
    public e3 n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public int x;
    public TL_iv.pageBlockEmbedPost y;

    public w1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.a = a70Var;
        this.b = j4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
    }

    @Override // org.telegram.ui.Cells.m9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.e;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
        e3 e3Var3 = this.h;
        if (e3Var3 != null) {
            arrayList.add(e3Var3);
        }
        e3 e3Var4 = this.n;
        if (e3Var4 != null) {
            arrayList.add(e3Var4);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.e;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
        e3 e3Var3 = this.h;
        if (e3Var3 != null) {
            e3Var3.attach(this);
        }
        e3 e3Var4 = this.n;
        if (e3Var4 != null) {
            e3Var4.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.e;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
        e3 e3Var3 = this.h;
        if (e3Var3 != null) {
            e3Var3.detach(this);
        }
        e3 e3Var4 = this.n;
        if (e3Var4 != null) {
            e3Var4.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i9;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.y;
        if (pageblockembedpost == null) {
            return;
        }
        boolean z10 = pageblockembedpost instanceof a4;
        a70 a70Var = this.a;
        if (z10) {
            canvas2 = canvas;
        } else {
            if (this.r) {
                this.c.draw(canvas);
            }
            if (this.f != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp((this.r ? 54 : 0) + 32), AndroidUtilities.dp(this.e != null ? 10.0f : 19.0f));
                l4.v(a70Var, canvas, this, 0);
                this.f.draw(canvas, this);
                canvas.restore();
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp((this.r ? 54 : 0) + 32), AndroidUtilities.dp(29.0f));
                l4.v(a70Var, canvas, this, i9);
                this.e.draw(canvas, this);
                canvas.restore();
                i9++;
            }
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(20.0f), this.x - (this.y.level == 0 ? AndroidUtilities.dp(6.0f) : 0), l4.m1);
            r2 = i9;
        }
        if (this.h != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v);
            l4.v(a70Var, canvas2, this, r2);
            this.h.draw(canvas2, this);
            canvas2.restore();
            r2++;
        }
        if (this.n != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v + this.w);
            l4.v(a70Var, canvas2, this, r2);
            this.n.draw(canvas2, this);
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f != null) {
            sb2.append(", ");
            sb2.append(this.f.d.getText());
        }
        if (this.e != null) {
            sb2.append(", ");
            sb2.append(this.e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.n != null) {
            sb2.append(", ");
            sb2.append(this.n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.y;
        int i11 = 1;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof a4;
            j4 j4Var = this.b;
            if (z10) {
                this.s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.y;
                e3 q10 = l4.q(this.a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.b);
                this.h = q10;
                if (q10 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.w = height;
                    r13 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.y;
                e3 p6 = l4.p(this.a, this, null, pageblockembedpost3.caption.credit, dp, 0, pageblockembedpost3, j4Var.C ? org.telegram.ui.Components.rv0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
                this.n = p6;
                if (p6 != null) {
                    r13 += this.n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i11 = r13;
            } else {
                long j10 = pageblockembedpost.author_photo_id;
                boolean z11 = j10 != 0;
                this.r = z11;
                if (z11) {
                    TLRPC.Photo e10 = i4.e(j4Var.A, j10);
                    boolean z12 = e10 instanceof TLRPC.TL_photo;
                    this.r = z12;
                    if (z12) {
                        String str = this.y.author;
                        org.telegram.ui.Components.z8 z8Var = this.d;
                        z8Var.n(0L, str, null);
                        this.c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e10.sizes, AndroidUtilities.dp(40.0f), true), e10), "40_40", z8Var, 0L, (String) null, j4Var.A, 1);
                    }
                }
                String str2 = this.y.author;
                int dp2 = size - AndroidUtilities.dp((this.r ? 54 : 0) + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.y;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                e3 p9 = l4.p(this.a, this, str2, null, dp2, 0, pageblockembedpost4, alignment, 1, this.b);
                this.f = p9;
                if (p9 != null) {
                    p9.s = AndroidUtilities.dp((this.r ? 54 : 0) + 32);
                    this.f.v = AndroidUtilities.dp(this.e != null ? 10.0f : 19.0f);
                }
                if (this.y.date != 0) {
                    this.e = l4.q(this.a, this, LocaleController.getInstance().getChatFullDate().format(this.y.date * 1000), null, size - AndroidUtilities.dp((this.r ? 54 : 0) + 50), AndroidUtilities.dp(29.0f), this.y, this.b);
                } else {
                    this.e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.y.blocks.isEmpty()) {
                    this.s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.y;
                    e3 q11 = l4.q(this.a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.b);
                    this.h = q11;
                    if (q11 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.w = height2;
                        dp3 = org.telegram.messenger.l0.C(4.0f, height2, dp3);
                    }
                    int i12 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.y;
                    e3 p10 = l4.p(this.a, this, null, pageblockembedpost6.caption.credit, dp4, 0, pageblockembedpost6, j4Var.C ? org.telegram.ui.Components.rv0.a() : alignment, 0, this.b);
                    this.n = p10;
                    dp3 = p10 != null ? this.n.d.getHeight() + AndroidUtilities.dp(4.0f) + i12 : i12;
                } else {
                    this.h = null;
                    this.n = null;
                }
                e3 e3Var = this.e;
                if (e3Var != null) {
                    e3Var.s = AndroidUtilities.dp((this.r ? 54 : 0) + 32);
                    this.e.v = AndroidUtilities.dp(29.0f);
                }
                e3 e3Var2 = this.h;
                if (e3Var2 != null) {
                    e3Var2.s = this.s;
                    e3Var2.v = this.v;
                }
                e3 e3Var3 = this.n;
                if (e3Var3 != null) {
                    e3Var3.s = this.s;
                    e3Var3.v = this.v;
                }
                i11 = dp3;
            }
            this.x = i11;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.a, this.b, motionEvent, this, this.h, this.s, this.v)) {
            return true;
        }
        return l4.l(this.a, this.b, motionEvent, this, this.n, this.s, this.v + this.w) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.y = pageblockembedpost;
        requestLayout();
    }
}
