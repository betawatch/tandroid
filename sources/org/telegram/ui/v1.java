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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v1 extends View implements org.telegram.ui.Cells.r9 {
    public final t70 a;
    public final h4 b;
    public final ImageReceiver c;
    public final org.telegram.ui.Components.g9 d;
    public c3 e;
    public c3 f;
    public c3 h;
    public c3 n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public int x;
    public TL_iv.pageBlockEmbedPost y;

    public v1(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.a = t70Var;
        this.b = h4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
        c3 c3Var3 = this.h;
        if (c3Var3 != null) {
            arrayList.add(c3Var3);
        }
        c3 c3Var4 = this.n;
        if (c3Var4 != null) {
            arrayList.add(c3Var4);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
        c3 c3Var3 = this.h;
        if (c3Var3 != null) {
            c3Var3.attach(this);
        }
        c3 c3Var4 = this.n;
        if (c3Var4 != null) {
            c3Var4.attach(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.e;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
        c3 c3Var3 = this.h;
        if (c3Var3 != null) {
            c3Var3.detach(this);
        }
        c3 c3Var4 = this.n;
        if (c3Var4 != null) {
            c3Var4.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.y;
        if (pageblockembedpost == null) {
            return;
        }
        boolean z10 = pageblockembedpost instanceof y3;
        t70 t70Var = this.a;
        if (z10) {
            canvas2 = canvas;
        } else {
            if (this.r) {
                this.c.draw(canvas);
            }
            if (this.f != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp((this.r ? 54 : 0) + 32), AndroidUtilities.dp(this.e != null ? 10.0f : 19.0f));
                j4.v(t70Var, canvas, this, 0);
                this.f.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp((this.r ? 54 : 0) + 32), AndroidUtilities.dp(29.0f));
                j4.v(t70Var, canvas, this, i10);
                this.e.draw(canvas, this);
                canvas.restore();
                i10++;
            }
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(20.0f), this.x - (this.y.level == 0 ? AndroidUtilities.dp(6.0f) : 0), j4.q1);
            r2 = i10;
        }
        if (this.h != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v);
            j4.v(t70Var, canvas2, this, r2);
            this.h.draw(canvas2, this);
            canvas2.restore();
            r2++;
        }
        if (this.n != null) {
            canvas2.save();
            canvas2.translate(this.s, this.v + this.w);
            j4.v(t70Var, canvas2, this, r2);
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
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.y;
        int i12 = 1;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof y3;
            h4 h4Var = this.b;
            if (z10) {
                this.s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.y;
                c3 q6 = j4.q(this.a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.b);
                this.h = q6;
                if (q6 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.w = height;
                    r13 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.y;
                c3 p5 = j4.p(this.a, this, null, pageblockembedpost3.caption.credit, dp, 0, pageblockembedpost3, h4Var.G ? org.telegram.ui.Components.uw0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.b);
                this.n = p5;
                if (p5 != null) {
                    r13 += this.n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i12 = r13;
            } else {
                long j3 = pageblockembedpost.author_photo_id;
                boolean z11 = j3 != 0;
                this.r = z11;
                if (z11) {
                    TLRPC.Photo e = g4.e(h4Var.E, j3);
                    boolean z12 = e instanceof TLRPC.TL_photo;
                    this.r = z12;
                    if (z12) {
                        String str = this.y.author;
                        org.telegram.ui.Components.g9 g9Var = this.d;
                        g9Var.n(0L, str, null);
                        this.c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e.sizes, AndroidUtilities.dp(40.0f), true), e), "40_40", g9Var, 0L, (String) null, h4Var.E, 1);
                    }
                }
                String str2 = this.y.author;
                int dp2 = size - AndroidUtilities.dp((this.r ? 54 : 0) + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.y;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                c3 p10 = j4.p(this.a, this, str2, null, dp2, 0, pageblockembedpost4, alignment, 1, this.b);
                this.f = p10;
                if (p10 != null) {
                    p10.s = AndroidUtilities.dp((this.r ? 54 : 0) + 32);
                    this.f.v = AndroidUtilities.dp(this.e != null ? 10.0f : 19.0f);
                }
                if (this.y.date != 0) {
                    this.e = j4.q(this.a, this, LocaleController.getInstance().getChatFullDate().format(this.y.date * 1000), null, size - AndroidUtilities.dp((this.r ? 54 : 0) + 50), AndroidUtilities.dp(29.0f), this.y, this.b);
                } else {
                    this.e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.y.blocks.isEmpty()) {
                    this.s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.y;
                    c3 q10 = j4.q(this.a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.b);
                    this.h = q10;
                    if (q10 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.w = height2;
                        dp3 = org.telegram.messenger.a2.C(4.0f, height2, dp3);
                    }
                    int i13 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.y;
                    c3 p11 = j4.p(this.a, this, null, pageblockembedpost6.caption.credit, dp4, 0, pageblockembedpost6, h4Var.G ? org.telegram.ui.Components.uw0.a() : alignment, 0, this.b);
                    this.n = p11;
                    dp3 = p11 != null ? this.n.d.getHeight() + AndroidUtilities.dp(4.0f) + i13 : i13;
                } else {
                    this.h = null;
                    this.n = null;
                }
                c3 c3Var = this.e;
                if (c3Var != null) {
                    c3Var.s = AndroidUtilities.dp((this.r ? 54 : 0) + 32);
                    this.e.v = AndroidUtilities.dp(29.0f);
                }
                c3 c3Var2 = this.h;
                if (c3Var2 != null) {
                    c3Var2.s = this.s;
                    c3Var2.v = this.v;
                }
                c3 c3Var3 = this.n;
                if (c3Var3 != null) {
                    c3Var3.s = this.s;
                    c3Var3.v = this.v;
                }
                i12 = dp3;
            }
            this.x = i12;
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (j4.l(this.a, this.b, motionEvent, this, this.h, this.s, this.v)) {
            return true;
        }
        return j4.l(this.a, this.b, motionEvent, this, this.n, this.s, this.v + this.w) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.y = pageblockembedpost;
        requestLayout();
    }
}
