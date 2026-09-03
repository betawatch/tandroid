package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class u00 extends FrameLayout {
    public final org.telegram.ui.ActionBar.p2 a;
    public final int b;
    public final int c;
    public final Drawable d;
    public final Drawable e;
    public final org.telegram.ui.Components.k6 f;
    public final org.telegram.ui.Components.k6 h;
    public final Paint n;
    public final Paint r;
    public float s;
    public boolean v;
    public ValueAnimator w;
    public String x;
    public TL_chatlists.TL_exportedChatlistInvite y;

    public u00(Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, int i11) {
        super(context);
        this.a = p2Var;
        this.b = i10;
        this.c = i11;
        setImportantForAccessibility(1);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, false);
        this.f = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(15.66f));
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        k6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        k6Var.setEllipsizeByGradient(true);
        boolean z4 = LocaleController.isRTL;
        addView(k6Var, k7.c6.d(-1, 20.0f, 55, z4 ? 56.0f : 64.0f, 10.33f, z4 ? 64.0f : 56.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.h = k6Var2;
        k6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.z6, false));
        k6Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z10 = LocaleController.isRTL;
        addView(k6Var2, k7.c6.d(-1, 16.0f, 55, z10 ? 56.0f : 64.0f, 33.33f, z10 ? 64.0f : 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false), 1, -1));
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Uh, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setOnClickListener(new a(this, 25));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        boolean z11 = LocaleController.isRTL;
        addView(imageView, k7.c6.d(40, 40.0f, (z11 ? 3 : 5) | 16, z11 ? 8.0f : 4.0f, 4.0f, z11 ? 4.0f : 8.0f, 4.0f));
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false));
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.wj, false));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_link_1).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_link_2).mutate();
        this.e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String str = this.x;
        String substring = str == null ? null : str.substring(str.lastIndexOf(47) + 1);
        if (substring == null) {
            return;
        }
        TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        t00 t00Var = new t00(this, 2);
        ConnectionsManager.getInstance(this.b).sendRequest(tL_chatlists_deleteExportedInvite, new lo(21, this, t00Var));
        AndroidUtilities.runOnUIThread(t00Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.a;
        if (p2Var instanceof b10) {
            mh.d1 d1Var = ((b10) p2Var).a;
            org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(p2Var, this);
            H.W(d1Var.U0(this, false));
            H.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new t00(this, 0), false);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new t00(this, 1), true);
            if (LocaleController.isRTL) {
                H.i = 3;
            }
            H.Z();
        }
    }

    public final void d() {
        if (this.x == null) {
            return;
        }
        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(getContext(), LocaleController.getString(R.string.InviteByQRCode), this.x, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
        si0Var.m(R.raw.qr_code_logo);
        si0Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z4) {
        boolean z10 = this.y == tL_exportedChatlistInvite;
        this.y = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.x = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        org.telegram.ui.Components.k6 k6Var = this.f;
        if (isEmpty) {
            k6Var.c(str, z10, true);
        } else {
            k6Var.c(tL_exportedChatlistInvite.title, z10, true);
        }
        this.h.c(LocaleController.formatPluralString("FilterInviteChats", tL_exportedChatlistInvite.peers.size(), new Object[0]), z10, true);
        if (this.v != z4) {
            this.v = z4;
            invalidate();
        }
        boolean z11 = tL_exportedChatlistInvite.revoked;
        if ((z11 ? 1.0f : 0.0f) != this.s) {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            if (!z10) {
                this.s = z11 ? 1.0f : 0.0f;
                invalidate();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z11 ? 1.0f : 0.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 13));
            this.w.addListener(new org.telegram.ui.Components.x20(18, this, z11));
            this.w.setInterpolator(org.telegram.ui.Components.pr.h);
            this.w.setDuration(350L);
            this.w.start();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(32.0f) : AndroidUtilities.dp(32.0f);
        float f10 = measuredWidth;
        canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.n);
        if (this.s > 0.0f) {
            canvas.drawCircle(f10, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f) * this.s, this.r);
        }
        float f11 = this.s;
        if (f11 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f11) * 255.0f));
            drawable.setBounds(measuredWidth - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + measuredWidth, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f12 = this.s;
        if (f12 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f12 * 255.0f));
            drawable2.setBounds(measuredWidth - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + measuredWidth, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.v) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.y;
        String str = "";
        sb.append((tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) ? "" : android.support.v4.media.a.r(new StringBuilder(), this.y.title, "\n "));
        b.i(R.string.InviteLink, ", ", sb);
        sb.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.y;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str = "\n\n" + this.y.url;
        }
        sb.append(str);
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
    }
}
