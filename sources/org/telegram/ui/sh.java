package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sh(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final int i9 = 0;
        final int i10 = 1;
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.b;
                dj djVar = qnVar.W0;
                if (djVar != null) {
                    djVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                break;
            case 1:
                ((kh.h6) this.b).invalidate();
                break;
            case 2:
                View view = ((b70) this.b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((b70) this.b).f.setOrientation(0);
                    } else {
                        ((b70) this.b).f.setOrientation(1);
                    }
                    View view2 = ((b70) this.b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((b70) this.b).fragmentView.getPaddingRight(), ((b70) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 3:
                ip0 ip0Var = (ip0) this.b;
                if (ip0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    ip0Var.f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        ip0Var.f = 4;
                    }
                    ip0Var.n.l();
                }
                org.telegram.ui.Components.wk0 wk0Var = ((ip0) this.b).h;
                if (wk0Var != null) {
                    wk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.s3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.t3;
                if (imageView != null) {
                    if (photoViewer.F3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.it0
                            public final /* synthetic */ sh b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i9) {
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.it0
                    public final /* synthetic */ sh b;

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
                    wallpapersListActivity.B0();
                }
                org.telegram.ui.Components.wk0 wk0Var2 = ((WallpapersListActivity) this.b).D;
                if (wk0Var2 != null) {
                    wk0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
