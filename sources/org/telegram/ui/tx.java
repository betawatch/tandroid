package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tx implements org.telegram.ui.Components.i40 {
    public final /* synthetic */ gy a;

    public tx(gy gyVar) {
        this.a = gyVar;
    }

    @Override // org.telegram.ui.Components.i40
    public final void E(float f10) {
        org.telegram.ui.Components.ec ecVar = this.a.a4;
        if (ecVar != null) {
            ((org.telegram.ui.Components.vb) ecVar.e).setProgress(f10 * 0.9f);
        }
    }

    @Override // org.telegram.ui.Components.i40
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        gy gyVar = this.a;
        org.telegram.ui.Components.ec ecVar = gyVar.a4;
        if (ecVar != null) {
            ecVar.b();
            gyVar.a4 = null;
        }
        Activity parentActivity = gyVar.getParentActivity();
        c6Var = ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider;
        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(parentActivity, c6Var);
        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(vbVar, parentActivity);
        vbVar.b = ubVar;
        ubVar.setWillNotDraw(false);
        vbVar.addView(ubVar, h7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(parentActivity);
        vbVar.c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        ubVar.addView(n9Var, h7.z5.e(28, 28, 17));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(parentActivity, false, false, false);
        vbVar.d = j6Var;
        j6Var.setTypeface(Typeface.SANS_SERIF);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        vbVar.addView(j6Var, h7.z5.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        vbVar.setTextColor(vbVar.getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        vbVar.setBackground(vbVar.getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        if (z10) {
            n9Var.setImageBitmap(gyVar.X3.r);
        } else {
            n9Var.setImageBitmap(PhotoViewer.t1().y4.getBitmap());
        }
        Activity parentActivity2 = gyVar.getParentActivity();
        c6Var2 = ((org.telegram.ui.ActionBar.n2) gyVar).resourceProvider;
        org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(parentActivity2, c6Var2, true);
        ccVar.e(LocaleController.getString(R.string.ViewAction));
        ccVar.a = new ti(this, 25);
        vbVar.setButton(ccVar);
        vbVar.getButton().setVisibility(8);
        j6Var.c(LocaleController.getString(z11 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true, true);
        org.telegram.ui.Components.ec b10 = org.telegram.ui.Components.mc.a0(gyVar).b(vbVar, -1);
        gyVar.a4 = b10;
        b10.r = false;
        b10.i(false);
        org.telegram.ui.Components.ec ecVar2 = gyVar.a4;
        ecVar2.s = true;
        ecVar2.j();
    }

    @Override // org.telegram.ui.Components.i40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.sx
            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.k kVar;
                tx txVar = tx.this;
                gy gyVar = txVar.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    gyVar.Y3 = photoSize2.location;
                    gyVar.Z3 = photoSize.location;
                } else {
                    if (gyVar.Y3 == null) {
                        return;
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    gyVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new hh.l7(txVar, str, z10, 4));
                }
                kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                kVar.n().requestLayout();
            }
        });
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.i40
    public final cu0 getCloseIntoObject() {
        gy gyVar = this.a;
        org.telegram.ui.Components.ec ecVar = gyVar.a4;
        if (ecVar == null) {
            return null;
        }
        org.telegram.ui.Components.vb vbVar = (org.telegram.ui.Components.vb) ecVar.e;
        cu0 cu0Var = new cu0();
        int[] iArr = new int[2];
        org.telegram.ui.Components.n9 n9Var = vbVar.c;
        org.telegram.ui.Components.n9 n9Var2 = vbVar.c;
        n9Var.getLocationInWindow(iArr);
        cu0Var.b = iArr[0];
        cu0Var.c = iArr[1];
        cu0Var.d = gyVar.fragmentView;
        ImageReceiver imageReceiver = n9Var2.getImageReceiver();
        cu0Var.a = imageReceiver;
        cu0Var.e = imageReceiver.getBitmapSafe();
        cu0Var.i = 0;
        cu0Var.h = cu0Var.a.getRoundRadius();
        cu0Var.k = n9Var2.getScaleX();
        return cu0Var;
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.Components.i40
    public final boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.i40
    public final /* synthetic */ void P() {
    }
}
