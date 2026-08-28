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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xo0 extends View {
    public final org.telegram.ui.ActionBar.b6 a;
    public final Paint b;
    public final int c;
    public final int d;
    public boolean e;
    public wo0[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public Utilities.Callback v;
    public wo0 w;

    public xo0(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.n = new Paint(1);
        this.r = true;
        this.s = 0;
        this.c = i9;
        this.d = i10;
        this.a = b6Var;
    }

    public final void a(int i9, boolean z10) {
        this.s = i9;
        if (this.f == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            wo0[] wo0VarArr = this.f;
            if (i10 >= wo0VarArr.length) {
                return;
            }
            wo0 wo0Var = wo0VarArr[i10];
            boolean z11 = wo0Var.o == i9;
            wo0Var.m = z11;
            if (!z10) {
                wo0Var.n.f(z11, true);
            }
            wo0Var.r.invalidate();
            i10++;
        }
    }

    public final void b() {
        int i9;
        if (this.f == null) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i10 = this.c;
        MessagesController.PeerColors peerColors = i10 == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
        int i11 = 0;
        while (true) {
            wo0[] wo0VarArr = this.f;
            if (i11 >= wo0VarArr.length) {
                invalidate();
                return;
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.a;
            int[] iArr = this.h;
            if (i10 == 2) {
                wo0 wo0Var = wo0VarArr[i11];
                int i12 = iArr[i11];
                wo0Var.o = i12;
                wo0Var.h = i12 < 0;
                if (i12 < 0) {
                    i9 = org.telegram.ui.ActionBar.f6.c8;
                } else {
                    int[] iArr2 = org.telegram.ui.ActionBar.f6.r8;
                    i9 = iArr2[i12 % iArr2.length];
                }
                int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
                wo0Var.g = false;
                wo0Var.f = false;
                wo0Var.a.setColor(v02);
            } else if (i11 < 7 && i10 == 1) {
                wo0 wo0Var2 = wo0VarArr[i11];
                int i13 = iArr[i11];
                wo0Var2.o = i13;
                int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.r8[i13], b6Var);
                wo0Var2.g = false;
                wo0Var2.f = false;
                wo0Var2.a.setColor(v03);
            } else if (peerColors != null && i11 >= 0 && i11 < peerColors.colors.size()) {
                this.f[i11].o = peerColors.colors.get(i11).id;
                this.f[i11].a(peerColors.colors.get(i11));
            }
            i11++;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            int i9 = 0;
            while (true) {
                wo0[] wo0VarArr = this.f;
                if (i9 >= wo0VarArr.length) {
                    break;
                }
                wo0 wo0Var = wo0VarArr[i9];
                xo0 xo0Var = wo0Var.r;
                Path path = wo0Var.e;
                canvas.save();
                float a2 = wo0Var.l.a(0.05f);
                RectF rectF = wo0Var.p;
                canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = wo0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(wo0Var.a);
                if (wo0Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, wo0Var.b);
                }
                canvas.restore();
                if (wo0Var.g) {
                    canvas.save();
                    float width = rectF.width() * 0.315f;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f10 = width / 2.0f;
                    rectF2.set(rectF.centerX() - f10, rectF.centerY() - f10, rectF.centerX() + f10, rectF.centerY() + f10);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.33f), AndroidUtilities.dp(2.33f), wo0Var.c);
                    canvas.restore();
                }
                float e10 = wo0Var.n.e(wo0Var.m);
                if (e10 > 0.0f) {
                    Paint paint = xo0Var.b;
                    Paint paint2 = xo0Var.b;
                    paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, xo0Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (AndroidUtilities.lerp(0.5f, -2.0f, e10) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (wo0Var.h) {
                    if (xo0Var.e) {
                        if (wo0Var.k == null) {
                            Drawable drawable = xo0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            wo0Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        wo0Var.k.setBounds((int) org.telegram.messenger.ll.c(wo0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.ll.c(wo0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) org.telegram.ui.Cells.j2.b(wo0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.ui.Cells.j2.b(wo0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        wo0Var.k.draw(canvas);
                    } else {
                        if (wo0Var.i == null) {
                            wo0Var.i = new Path();
                        }
                        if (wo0Var.j == null) {
                            Paint paint3 = new Paint(1);
                            wo0Var.j = paint3;
                            paint3.setColor(-1);
                            wo0Var.j.setStyle(Paint.Style.STROKE);
                            wo0Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        wo0Var.j.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        wo0Var.i.rewind();
                        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f), e10);
                        wo0Var.i.moveTo(rectF.centerX() - lerp, rectF.centerY() - lerp);
                        wo0Var.i.lineTo(rectF.centerX() + lerp, rectF.centerY() + lerp);
                        wo0Var.i.moveTo(rectF.centerX() + lerp, rectF.centerY() - lerp);
                        wo0Var.i.lineTo(rectF.centerX() - lerp, rectF.centerY() + lerp);
                        canvas.drawPath(wo0Var.i, wo0Var.j);
                    }
                }
                canvas.restore();
                i9++;
            }
        }
        if (this.r) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, this.a);
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
        wo0 wo0Var;
        wo0 wo0Var2;
        Utilities.Callback callback;
        Utilities.Callback callback2;
        if (this.f != null) {
            int i9 = 0;
            while (true) {
                wo0[] wo0VarArr = this.f;
                if (i9 >= wo0VarArr.length) {
                    break;
                }
                if (wo0VarArr[i9].q.contains(motionEvent.getX(), motionEvent.getY())) {
                    wo0Var = this.f[i9];
                    break;
                }
                i9++;
            }
            if (motionEvent.getAction() != 0) {
                this.w = wo0Var;
                if (wo0Var != null) {
                    wo0Var.l.c(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                wo0 wo0Var3 = this.w;
                if (wo0Var3 != wo0Var) {
                    if (wo0Var3 != null) {
                        wo0Var3.l.c(false);
                    }
                    if (wo0Var != null) {
                        wo0Var.l.c(true);
                    }
                    if (this.w != null && wo0Var != null && (callback2 = this.v) != null) {
                        callback2.run(Integer.valueOf(wo0Var.o));
                    }
                    this.w = wo0Var;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (wo0Var2 = this.w) != null && (callback = this.v) != null) {
                    callback.run(Integer.valueOf(wo0Var2.o));
                }
                if (this.f != null) {
                    int i10 = 0;
                    while (true) {
                        wo0[] wo0VarArr2 = this.f;
                        if (i10 >= wo0VarArr2.length) {
                            break;
                        }
                        wo0VarArr2[i10].l.c(false);
                        i10++;
                    }
                }
                this.w = null;
                return true;
            }
            return true;
        }
        wo0Var = null;
        if (motionEvent.getAction() != 0) {
        }
        return true;
    }

    public int getColorId() {
        return this.s;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        MessagesController messagesController = MessagesController.getInstance(this.d);
        int i12 = this.c;
        MessagesController.PeerColors peerColors = i12 == 1 ? messagesController.peerColors : messagesController.profilePeerColors;
        int size2 = peerColors == null ? 0 : peerColors.colors.size();
        int i13 = 8;
        int i14 = 2;
        if (i12 == 2) {
            size2 = 8;
        }
        if (i12 != 2 && i12 == 1) {
            i13 = 7;
        }
        float f10 = size;
        float f11 = i13;
        float f12 = i13 + 1;
        float min = Math.min(AndroidUtilities.dp(54.0f), f10 / ((f12 * 0.28947f) + f11));
        float min2 = Math.min(0.28947f * min, AndroidUtilities.dp(8.0f));
        float min3 = Math.min(0.31578946f * min, AndroidUtilities.dp(11.33f));
        setMeasuredDimension(size, (int) (((r15 + 1) * min3) + ((size2 / i13) * min)));
        wo0[] wo0VarArr = this.f;
        if (wo0VarArr == null || wo0VarArr.length != size2) {
            this.f = new wo0[size2];
            int i15 = 0;
            while (i15 < size2) {
                this.f[i15] = new wo0(this);
                if (i12 == i14) {
                    wo0 wo0Var = this.f[i15];
                    int i16 = this.h[i15];
                    wo0Var.o = i16;
                    wo0Var.h = i16 < 0;
                    if (i16 < 0) {
                        i11 = org.telegram.ui.ActionBar.f6.c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.f6.r8;
                        i11 = iArr[i16 % iArr.length];
                    }
                    int v02 = org.telegram.ui.ActionBar.f6.v0(i11, this.a);
                    wo0Var.g = false;
                    wo0Var.f = false;
                    wo0Var.a.setColor(v02);
                } else if (peerColors != null && i15 >= 0 && i15 < peerColors.colors.size()) {
                    this.f[i15].o = peerColors.colors.get(i15).id;
                    this.f[i15].a(peerColors.colors.get(i15));
                }
                i15++;
                i14 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f != null) {
            float f14 = f13;
            float f15 = min3;
            for (int i17 = 0; i17 < this.f.length; i17++) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f[i17].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i17].q.set(rectF);
                wo0 wo0Var2 = this.f[i17];
                boolean z10 = wo0Var2.o == this.s;
                wo0Var2.m = z10;
                wo0Var2.n.f(z10, true);
                wo0Var2.r.invalidate();
                if (i17 % i13 == i13 - 1) {
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
