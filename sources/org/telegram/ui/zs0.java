package org.telegram.ui;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class zs0 implements org.telegram.ui.Components.g81 {
    public boolean a = true;
    public final /* synthetic */ PhotoViewer b;

    public zs0(PhotoViewer photoViewer) {
        this.b = photoViewer;
    }

    @Override // org.telegram.ui.Components.g81
    public final void onError(org.telegram.ui.Components.j81 j81Var, Exception exc) {
        View findViewWithTag;
        PhotoViewer photoViewer = this.b;
        if (photoViewer.F2 != j81Var) {
            return;
        }
        FileLog.e(exc);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = photoViewer.o0.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(10)) == null || findViewWithTag.getVisibility() != 0) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(photoViewer.y, 0, photoViewer.v2);
        alertDialog$Builder.a.R = LocaleController.getString("AppName", R.string.AppName);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.CantPlayVideo);
        alertDialog$Builder.k(LocaleController.getString("Open", R.string.Open), new sp0(this, 2));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        photoViewer.U2(alertDialog$Builder);
    }

    @Override // org.telegram.ui.Components.g81
    public final void onRenderedFirstFrame() {
        PhotoViewer photoViewer = this.b;
        if (!photoViewer.H3) {
            photoViewer.H3 = true;
            photoViewer.e0.invalidate();
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
            if (j81Var == null || !j81Var.V) {
                AndroidUtilities.runOnUIThread(new ys0(this, 1), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.g81
    public final void onStateChanged(boolean z10, int i10) {
        org.telegram.ui.Components.j81 j81Var;
        int i11;
        VideoEditedInfo videoEditedInfo;
        PhotoViewer photoViewer = this.b;
        ArrayList arrayList = photoViewer.g7;
        org.telegram.ui.Components.j81 j81Var2 = photoViewer.F2;
        if (j81Var2 != null) {
            j81Var2.O(b5.d.u() || photoViewer.r);
        }
        if (this.a && (j81Var = photoViewer.F2) != null && j81Var.p() != -9223372036854775807L) {
            this.a = false;
            if (photoViewer.Y6.isEmpty() && photoViewer.e7.isEmpty() && photoViewer.a7.isEmpty() && !arrayList.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList.size()) {
                Object obj = arrayList.get(photoViewer.Q4);
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && (videoEditedInfo = photoEntry.editedInfo) != null) {
                        photoViewer.F2.K((long) (videoEditedInfo.start * r3.p()));
                        hs0 hs0Var = photoViewer.S7;
                        if (hs0Var != null) {
                            hs0Var.setProgress(photoEntry.editedInfo.start);
                        }
                    }
                }
            }
        }
        photoViewer.A3(i10, z10);
    }

    @Override // org.telegram.ui.Components.g81
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        rf.d p5 = org.telegram.ui.Components.dh0.p();
        PhotoViewer photoViewer = this.b;
        if (p5 != null && org.telegram.ui.Components.dh0.p().b.a != 0 && (textureView = photoViewer.w3) != null && textureView.getSurfaceTexture() == surfaceTexture) {
            org.telegram.ui.Components.dh0 dh0Var = org.telegram.ui.Components.dh0.p0;
            (dh0Var != null ? dh0Var.l0 : null).setSurfaceTexture(surfaceTexture);
            (dh0Var != null ? dh0Var.l0 : null).setVisibility(0);
            return true;
        }
        if (photoViewer.F3) {
            photoViewer.F3 = false;
            if (photoViewer.J3) {
                photoViewer.G3 = 1;
                photoViewer.w3.setSurfaceTexture(surfaceTexture);
                photoViewer.w3.setSurfaceTextureListener(photoViewer.j4);
                photoViewer.w3.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.g81
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.b.y0(false);
        AndroidUtilities.runOnUIThread(new ys0(this, 0));
    }

    @Override // org.telegram.ui.Components.g81
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.y2 != null) {
            float f10 = i10 * f7;
            int i13 = (int) f10;
            photoViewer.U = i13;
            float f11 = i11;
            int i14 = (int) (f7 * f11);
            photoViewer.V = i14;
            rf.d dVar = photoViewer.G2;
            if (dVar != null) {
                dVar.d(i13, i14);
            }
            photoViewer.y2.a(i11 == 0 ? 1.0f : f10 / f11, 0);
            if (photoViewer.B2 instanceof org.telegram.ui.Components.z71) {
                ((org.telegram.ui.Components.z71) photoViewer.B2).setHDRInfo(photoViewer.F2.q(null));
                org.telegram.ui.Components.z71 z71Var = (org.telegram.ui.Components.z71) photoViewer.B2;
                z71Var.d = i13;
                z71Var.e = i11;
                org.telegram.ui.Components.e00 e00Var = z71Var.b;
                if (e00Var != null) {
                    e00Var.postRunnable(new org.telegram.ui.Components.a00(e00Var, i13, i11, 0));
                }
                if (photoViewer.c2 == 1) {
                    photoViewer.B2();
                }
            }
            photoViewer.I3 = true;
        }
    }

    @Override // org.telegram.ui.Components.g81
    public final void onRenderedFirstFrame(j2.a aVar) {
        PhotoViewer photoViewer = this.b;
        com.google.android.gms.internal.cast.p pVar = photoViewer.Q8;
        if (pVar != null) {
            pVar.run();
            photoViewer.Q8 = null;
        }
        long j10 = aVar.e;
        if (j10 == photoViewer.X7) {
            photoViewer.W7 = j10;
            photoViewer.X7 = -1L;
            PhotoViewer.W(photoViewer);
        }
        if (photoViewer.E2 != null) {
            org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
            if (j81Var == null || !j81Var.V) {
                AndroidUtilities.runOnUIThread(new ys0(this, 2), 64L);
            }
        }
    }

    @Override // org.telegram.ui.Components.g81
    public final /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public final /* synthetic */ void onSeekStarted(j2.a aVar) {
    }
}
