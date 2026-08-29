package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vh(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final int i10 = 0;
        final int i11 = 1;
        switch (this.a) {
            case 0:
                tn tnVar = (tn) this.b;
                gj gjVar = tnVar.W0;
                if (gjVar != null) {
                    gjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                break;
            case 1:
                ((cg.i0) this.b).invalidate();
                break;
            case 2:
                View view = ((e70) this.b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((e70) this.b).f.setOrientation(0);
                    } else {
                        ((e70) this.b).f.setOrientation(1);
                    }
                    View view2 = ((e70) this.b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((e70) this.b).fragmentView.getPaddingRight(), ((e70) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 3:
                hp0 hp0Var = (hp0) this.b;
                if (hp0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    hp0Var.f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        hp0Var.f = 4;
                    }
                    hp0Var.n.l();
                }
                org.telegram.ui.Components.jl0 jl0Var = ((hp0) this.b).h;
                if (jl0Var != null) {
                    jl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.s3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.t3;
                if (imageView != null) {
                    if (photoViewer.F3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.gt0
                            public final /* synthetic */ vh b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.b.b;
                                        photoViewer2.t3.setVisibility(4);
                                        photoViewer2.t3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.y3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.y3 = null;
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.b.b;
                                        if (photoViewer3.F3) {
                                            photoViewer3.S0();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.t3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.y3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.y3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.gt0
                    public final /* synthetic */ vh b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.b.b;
                                photoViewer2.t3.setVisibility(4);
                                photoViewer2.t3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.y3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.y3 = null;
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.b.b;
                                if (photoViewer3.F3) {
                                    photoViewer3.S0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                photoViewer.C3 = 0;
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                int[][] iArr = WallpapersListActivity.g0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.N = 5;
                    } else {
                        wallpapersListActivity.N = 3;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.jl0 jl0Var2 = ((WallpapersListActivity) this.b).D;
                if (jl0Var2 != null) {
                    jl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
