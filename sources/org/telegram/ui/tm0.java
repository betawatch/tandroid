package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tm0 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final TextView a;
    public final TextView b;
    public final org.telegram.ui.Components.t9 c;
    public final org.telegram.ui.Components.bj0 d;
    public int e;
    public SecureDocument f;
    public final int h;
    public final /* synthetic */ vm0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm0(vm0 vm0Var, Activity activity) {
        super(activity);
        int i10;
        this.n = vm0Var;
        i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
        this.h = DownloadController.getInstance(i10).generateObserverTag();
        this.d = new org.telegram.ui.Components.bj0(this);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(activity);
        this.c = t9Var;
        addView(t9Var, i7.f6.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a = textView;
        b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z10 = LocaleController.isRTL;
        addView(textView, i7.f6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 81, 10.0f, z10 ? 81 : 21, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, i7.f6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 81, 35.0f, z11 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        String attachFileName = FileLoader.getAttachFileName(this.f);
        boolean exists = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.f).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (isEmpty) {
            bj0Var.d(null, false, false);
            return;
        }
        SecureDocument secureDocument = this.f;
        String str = secureDocument.path;
        vm0 vm0Var = this.n;
        if (str != null) {
            if (secureDocument.inputFile != null) {
                i13 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                DownloadController.getInstance(i13).removeLoadingFileObserver(this);
                bj0Var.d(null, false, z10);
                this.e = -1;
                return;
            }
            i12 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
            DownloadController.getInstance(i12).addLoadingFileObserver(this.f.path, this);
            this.e = 1;
            Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f.path);
            bj0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
            bj0Var.e(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            invalidate();
            return;
        }
        if (exists) {
            i11 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            this.e = -1;
            bj0Var.d(null, false, z10);
            invalidate();
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
        DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this);
        this.e = 1;
        Float fileProgress2 = ImageLoader.getInstance().getFileProgress(attachFileName);
        bj0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
        bj0Var.e(fileProgress2 != null ? fileProgress2.floatValue() : 0.0f, z10);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view == this.c) {
            this.d.a(canvas);
        }
        return drawChild;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.h;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.k0);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        a(false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        org.telegram.ui.Components.t9 t9Var = this.c;
        int measuredWidth = ((t9Var.getMeasuredWidth() - AndroidUtilities.dp(24.0f)) / 2) + t9Var.getLeft();
        int measuredHeight = ((t9Var.getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2) + t9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), b.B(64.0f, 1, TLObject.FLAG_30));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.d.e(Math.min(1.0f, j10 / j11), true);
        if (this.e != 1) {
            a(false);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        this.d.e(Math.min(1.0f, j10 / j11), true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.d.e(1.0f, true);
        a(true);
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
