package ph;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class d6 extends View {
    public c6 B;
    public View C;
    public Object D;
    public Runnable E;
    public String F;
    public final int[] G;
    public final int[] H;
    public boolean I;
    public final int a;
    public final h8 b;
    public i8 c;
    public final org.telegram.ui.Components.z5 d;
    public final RectF e;
    public final RectF f;
    public final ImageReceiver h;
    public boolean n;
    public k01 r;
    public k01 s;
    public final Path v;
    public final Paint w;
    public final rc x;
    public boolean y;

    public d6(Activity activity, int i10, h8 h8Var) {
        super(activity);
        this.d = new org.telegram.ui.Components.z5(this, 0L, 320L, nr.h);
        this.e = new RectF();
        this.f = new RectF();
        this.h = new ImageReceiver(this);
        this.v = new Path();
        this.w = new Paint(1);
        this.x = new rc(this);
        this.G = new int[2];
        this.H = new int[2];
        this.a = i10;
        this.b = h8Var;
    }

    public final void a() {
        c6 c6Var = this.B;
        if (c6Var == null) {
            return;
        }
        this.r = new k01(c6Var.b(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.B.a());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.B.a(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            mq mqVar = new mq(R.drawable.settings_arrow, 0);
            mqVar.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(mqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.s = new k01(spannableStringBuilder, 14.0f, null);
        this.B.d(this.h);
        this.n = true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        Object obj;
        float e = this.d.e(this.y);
        k01 k01Var = this.r;
        if (k01Var == null || this.s == null || e <= 0.0f) {
            return;
        }
        k01Var.p = getWidth() * 0.7f;
        this.s.p = getWidth() * 0.7f;
        float dp = AndroidUtilities.dp(5.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        float dp3 = AndroidUtilities.dp(32.0f);
        float dp4 = AndroidUtilities.dp(2.0f);
        float dp5 = AndroidUtilities.dp(11.0f);
        float max = Math.max(Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f), Math.max(this.r.c, this.s.c) + (this.n ? dp5 + dp3 + dp5 : 0.0f) + dp + AndroidUtilities.dp(15.0f) + dp);
        float max2 = Math.max(this.n ? dp3 : 0.0f, this.s.j() + this.r.j() + dp4) + dp2 + dp2;
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e) * this.x.a(0.05f);
        float dp6 = (1.0f - e) * AndroidUtilities.dp(15.0f);
        float width = (getWidth() - max) / 2.0f;
        float height = (getHeight() - max2) / 2.0f;
        float width2 = (getWidth() + max) / 2.0f;
        float height2 = (getHeight() + max2) / 2.0f;
        RectF rectF = this.e;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        AndroidUtilities.scaleRect(rectF2, lerp);
        rectF2.offset(0.0f, dp6);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.w;
        if (i10 < 29 || (obj = this.D) == null || this.C == null) {
            f10 = dp;
            f11 = 2.0f;
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, -587202560));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        } else {
            RenderNode c3 = org.telegram.messenger.b.c(obj);
            Path path = this.v;
            path.rewind();
            f11 = 2.0f;
            f10 = dp;
            path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            getLocationOnScreen(this.G);
            this.C.getLocationOnScreen(this.H);
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * e), 31);
            canvas.clipPath(path);
            canvas.translate(r10[0] - r7[0], r10[1] - r7[1]);
            float max3 = Math.max(this.C.getWidth() / c3.getWidth(), this.C.getHeight() / c3.getHeight());
            canvas.scale(max3, max3);
            canvas.drawRenderNode(c3);
            canvas.restore();
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, 1879048192));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        canvas.save();
        canvas.translate(0.0f, dp6);
        canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
        if (this.n) {
            float f12 = dp3 / f11;
            ImageReceiver imageReceiver = this.h;
            imageReceiver.setRoundRadius((int) f12);
            imageReceiver.setImageCoords(rectF.left + f10 + dp5, rectF.centerY() - f12, dp3, dp3);
            imageReceiver.setAlpha(e);
            imageReceiver.draw(canvas);
        }
        float centerY = rectF.centerY() - ((this.s.j() + (this.r.j() + dp4)) / f11);
        k01 k01Var2 = this.r;
        k01Var2.c(rectF.left + (this.n ? dp5 + dp3 + dp5 : 0.0f) + f10, (k01Var2.j() / f11) + centerY, e, -1, canvas);
        this.s.c(rectF.left + (this.n ? dp3 + dp5 + dp5 : 0.0f) + f10, this.r.j() + centerY + dp4 + (this.s.j() / f11), e, org.telegram.ui.ActionBar.j6.v(-16777216, -1610612737), canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i8 i8Var;
        boolean z4 = this.y;
        rc rcVar = this.x;
        if (!z4 || this.B == null) {
            this.I = false;
            rcVar.c(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.e;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.I = true;
                rcVar.c(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (rcVar.h && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                rcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (rcVar.h && (i8Var = this.c) != null && this.B != null) {
                i8Var.run(new z5(this, 1));
            }
            rcVar.c(false);
            this.I = false;
        } else if (motionEvent.getAction() == 3) {
            rcVar.c(false);
            this.I = false;
        }
        return this.I || rcVar.h;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.onDetachedFromWindow();
    }

    public void setLink(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        h8 h8Var = this.b;
        Runnable runnable = null;
        if (isEmpty) {
            Runnable runnable2 = this.E;
            if (runnable2 != null) {
                runnable2.run();
                this.E = null;
            }
            if (this.y) {
                invalidate();
            }
            this.y = false;
            this.F = null;
            if (h8Var != null) {
                h8Var.run();
                return;
            }
            return;
        }
        c6 c6Var = this.B;
        if (!(c6Var == null && this.E == null) && (c6Var == null || TextUtils.equals(c6Var.a, str) || TextUtils.equals(this.F, str))) {
            c6 c6Var2 = this.B;
            if (c6Var2 == null || this.y || !TextUtils.equals(c6Var2.a, str)) {
                return;
            }
            this.y = true;
            a();
            invalidate();
            if (h8Var != null) {
                h8Var.run();
                return;
            }
            return;
        }
        Runnable runnable3 = this.E;
        if (runnable3 != null) {
            runnable3.run();
            this.E = null;
        }
        this.B = null;
        this.F = str;
        int i10 = this.a;
        z5 z5Var = new z5(this, 0);
        try {
            MessagesController messagesController = MessagesController.getInstance(i10);
            String str2 = messagesController.linkPrefix;
            Uri parse = Uri.parse(str);
            if (TextUtils.equals(parse.getHost(), str2)) {
                List<String> pathSegments = parse.getPathSegments();
                if (!pathSegments.isEmpty()) {
                    String str3 = pathSegments.get(0);
                    String queryParameter = parse.getQueryParameter("ref");
                    if (TextUtils.isEmpty(queryParameter)) {
                        TLObject userOrChat = messagesController.getUserOrChat(str3);
                        if (userOrChat instanceof TLRPC.User) {
                            z5Var.run(new a6(str, (TLRPC.User) userOrChat));
                        } else if (userOrChat instanceof TLRPC.Chat) {
                            z5Var.run(new b6(str, (TLRPC.Chat) userOrChat));
                        }
                    }
                    runnable = messagesController.getUserNameResolver().resolve(str3, queryParameter, new eg.f0(z5Var, messagesController, str, 1));
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            z5Var.run(runnable);
        }
        this.E = runnable;
    }
}
