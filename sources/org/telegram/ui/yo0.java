package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yo0 extends View {
    public final org.telegram.ui.ActionBar.c6 a;
    public final Paint b;
    public final int c;
    public final int d;
    public boolean e;
    public xo0[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public Utilities.Callback v;
    public xo0 w;

    public yo0(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.n = new Paint(1);
        this.r = true;
        this.s = 0;
        this.c = i10;
        this.d = i11;
        this.a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        this.s = i10;
        if (this.f == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            xo0[] xo0VarArr = this.f;
            if (i11 >= xo0VarArr.length) {
                return;
            }
            xo0 xo0Var = xo0VarArr[i11];
            boolean z11 = xo0Var.o == i10;
            xo0Var.m = z11;
            if (!z10) {
                xo0Var.n.f(z11, true);
            }
            xo0Var.r.invalidate();
            i11++;
        }
    }

    public final void b() {
        int i10;
        if (this.f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i11 = this.c;
        MessagesController.PeerColors peerColors = i11 == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
        int i12 = 0;
        while (true) {
            xo0[] xo0VarArr = this.f;
            if (i12 >= xo0VarArr.length) {
                invalidate();
                return;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.a;
            int[] iArr = this.h;
            if (i11 == 2) {
                xo0 xo0Var = xo0VarArr[i12];
                int i13 = iArr[i12];
                xo0Var.o = i13;
                xo0Var.h = i13 < 0;
                if (i13 < 0) {
                    i10 = org.telegram.ui.ActionBar.g6.c8;
                } else {
                    int[] iArr2 = org.telegram.ui.ActionBar.g6.r8;
                    i10 = iArr2[i13 % iArr2.length];
                }
                int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
                xo0Var.g = false;
                xo0Var.f = false;
                xo0Var.a.setColor(v02);
            } else if (i12 < 7 && i11 == 1) {
                xo0 xo0Var2 = xo0VarArr[i12];
                int i14 = iArr[i12];
                xo0Var2.o = i14;
                int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.r8[i14], c6Var);
                xo0Var2.g = false;
                xo0Var2.f = false;
                xo0Var2.a.setColor(v03);
            } else if (peerColors != null && i12 >= 0 && i12 < peerColors.colors.size()) {
                this.f[i12].o = peerColors.colors.get(i12).id;
                this.f[i12].a(peerColors.colors.get(i12));
            }
            i12++;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                xo0[] xo0VarArr = this.f;
                if (i10 >= xo0VarArr.length) {
                    break;
                }
                xo0 xo0Var = xo0VarArr[i10];
                yo0 yo0Var = xo0Var.r;
                Path path = xo0Var.e;
                canvas.save();
                float a2 = xo0Var.l.a(0.05f);
                RectF rectF = xo0Var.p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = xo0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(xo0Var.a);
                if (xo0Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, xo0Var.b);
                }
                canvas.restore();
                if (xo0Var.g) {
                    canvas.save();
                    float width = rectF.width() * 0.315f;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f10 = width / 2.0f;
                    rectF2.set(rectF.centerX() - f10, rectF.centerY() - f10, rectF.centerX() + f10, rectF.centerY() + f10);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), xo0Var.c);
                    canvas.restore();
                }
                float e9 = xo0Var.n.e(xo0Var.m);
                if (e9 > 0.0f) {
                    Paint paint = yo0Var.b;
                    Paint paint2 = yo0Var.b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, yo0Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e9) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (xo0Var.h) {
                    if (yo0Var.e) {
                        if (xo0Var.k == null) {
                            Drawable drawable = yo0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            xo0Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        xo0Var.k.setBounds((int) org.telegram.messenger.rl.c(xo0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.rl.c(xo0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) s3.c.c(xo0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) s3.c.c(xo0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        xo0Var.k.draw(canvas);
                    } else {
                        if (xo0Var.i == null) {
                            xo0Var.i = new Path();
                        }
                        if (xo0Var.j == null) {
                            Paint paint3 = new Paint(1);
                            xo0Var.j = paint3;
                            paint3.setColor(-1);
                            xo0Var.j.setStyle(Paint.Style.STROKE);
                            xo0Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        xo0Var.j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        xo0Var.i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e9);
                        xo0Var.i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        xo0Var.i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        xo0Var.i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        xo0Var.i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(xo0Var.i, xo0Var.j);
                    }
                }
                canvas.restore();
                i10++;
            }
        }
        if (this.r) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, this.a);
            Paint paint4 = this.n;
            paint4.setColor(v02);
            canvas.drawRect(AndroidUtilities.dp(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(21.0f), getMeasuredHeight(), paint4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xo0 xo0Var;
        xo0 xo0Var2;
        Utilities.Callback callback;
        Utilities.Callback callback2;
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                xo0[] xo0VarArr = this.f;
                if (i10 >= xo0VarArr.length) {
                    break;
                }
                if (xo0VarArr[i10].q.contains(motionEvent.getX(), motionEvent.getY())) {
                    xo0Var = this.f[i10];
                    break;
                }
                i10++;
            }
            if (motionEvent.getAction() != 0) {
                this.w = xo0Var;
                if (xo0Var != null) {
                    xo0Var.l.c(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                xo0 xo0Var3 = this.w;
                if (xo0Var3 != xo0Var) {
                    if (xo0Var3 != null) {
                        xo0Var3.l.c(false);
                    }
                    if (xo0Var != null) {
                        xo0Var.l.c(true);
                    }
                    if (this.w != null && xo0Var != null && (callback2 = this.v) != null) {
                        callback2.run(Integer.valueOf(xo0Var.o));
                    }
                    this.w = xo0Var;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (xo0Var2 = this.w) != null && (callback = this.v) != null) {
                    callback.run(Integer.valueOf(xo0Var2.o));
                }
                if (this.f != null) {
                    int i11 = 0;
                    while (true) {
                        xo0[] xo0VarArr2 = this.f;
                        if (i11 >= xo0VarArr2.length) {
                            break;
                        }
                        xo0VarArr2[i11].l.c(false);
                        i11++;
                    }
                }
                this.w = null;
                return true;
            }
            return true;
        }
        xo0Var = null;
        if (motionEvent.getAction() != 0) {
        }
        return true;
    }

    public int getColorId() {
        return this.s;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i13 = this.c;
        MessagesController.PeerColors peerColors = i13 == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
        int size2 = peerColors == null ? 0 : peerColors.colors.size();
        int i14 = 8;
        int i15 = 2;
        if (i13 == 2) {
            size2 = 8;
        }
        if (i13 != 2 && i13 == 1) {
            i14 = 7;
        }
        float f10 = size;
        float f11 = i14;
        float f12 = i14 + 1;
        float min = Math.min(AndroidUtilities.dp(54.0f), f10 / ((f12 * 0.28947f) + f11));
        float min2 = Math.min(0.28947f * min, AndroidUtilities.dp(8.0f));
        float min3 = Math.min(0.31578946f * min, AndroidUtilities.dp(11.33f));
        setMeasuredDimension(size, (int) (((r15 + 1) * min3) + ((size2 / i14) * min)));
        xo0[] xo0VarArr = this.f;
        if (xo0VarArr == null || xo0VarArr.length != size2) {
            this.f = new xo0[size2];
            int i16 = 0;
            while (i16 < size2) {
                this.f[i16] = new xo0(this);
                if (i13 == i15) {
                    xo0 xo0Var = this.f[i16];
                    int i17 = this.h[i16];
                    xo0Var.o = i17;
                    xo0Var.h = i17 < 0;
                    if (i17 < 0) {
                        i12 = org.telegram.ui.ActionBar.g6.c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.g6.r8;
                        i12 = iArr[i17 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.g6.v0(i12, this.a);
                    xo0Var.g = false;
                    xo0Var.f = false;
                    xo0Var.a.setColor(v02);
                } else if (peerColors != null && i16 >= 0 && i16 < peerColors.colors.size()) {
                    this.f[i16].o = peerColors.colors.get(i16).id;
                    this.f[i16].a(peerColors.colors.get(i16));
                }
                i16++;
                i15 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f != null) {
            float f14 = f13;
            float f15 = min3;
            for (int i18 = 0; i18 < this.f.length; i18++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f[i18].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i18].q.set(rectF);
                xo0 xo0Var2 = this.f[i18];
                boolean z10 = xo0Var2.o == this.s;
                xo0Var2.m = z10;
                xo0Var2.n.f(z10, true);
                xo0Var2.r.invalidate();
                if (i18 % i14 == i14 - 1) {
                    f15 += min + min3;
                    f14 = f13;
                } else {
                    f14 = min + min2 + f14;
                }
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.e = z10;
    }

    public void setDivider(boolean z10) {
        this.r = z10;
        invalidate();
    }

    public void setOnColorClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }
}
