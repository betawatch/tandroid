package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zh1 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public zh1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 0;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.a;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i9 == i10 || i9 == wallpapersListActivity.r || i9 == wallpapersListActivity.b || i9 == wallpapersListActivity.h) {
            return 0;
        }
        if (i9 == wallpapersListActivity.c || i9 == wallpapersListActivity.f) {
            return 1;
        }
        return (i9 == wallpapersListActivity.n || i9 == wallpapersListActivity.s) ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0158, code lost:
    
        if (((int) (r9.h * 100.0f)) == ((int) (r3.U * 100.0f))) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012b, code lost:
    
        if (r9.f == r3.T) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013a, code lost:
    
        if (r9.a == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        long j10;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.a0;
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            i10 = wallpapersListActivity.uploadImageRow;
            if (i9 == i10) {
                p8Var.m(R.drawable.msg_photos, LocaleController.getString(R.string.SelectFromGallery), true);
                return;
            }
            if (i9 == wallpapersListActivity.b) {
                p8Var.m(R.drawable.msg_palette, LocaleController.getString(R.string.SetColor), true);
                return;
            }
            if (i9 == wallpapersListActivity.h) {
                p8Var.i(LocaleController.getString(R.string.ResetChatBackgrounds), false);
                return;
            } else {
                if (i9 == wallpapersListActivity.r) {
                    p8Var.m(R.drawable.msg_background, "Choose from gallery", false);
                    p8Var.h(10);
                    return;
                }
                return;
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == wallpapersListActivity.n) {
                b9Var.setText(LocaleController.getString(R.string.ResetChatBackgroundsInfo));
                return;
            } else {
                if (i9 == wallpapersListActivity.s) {
                    b9Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
        int i12 = i9 - wallpapersListActivity.d;
        int i13 = wallpapersListActivity.N;
        int i14 = i12 * i13;
        zaVar.d(i13, i14 == 0, i14 / i13 == wallpapersListActivity.e - 1);
        for (int i15 = 0; i15 < wallpapersListActivity.N; i15++) {
            int i16 = i14 + i15;
            Object obj2 = i16 < arrayList.size() ? arrayList.get(i16) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.y5 y5Var = org.telegram.ui.ActionBar.f6.I.e0;
                obj = (wallpapersListActivity.O.equals(tL_wallPaper.slug) && (!wallpapersListActivity.O.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.P == org.telegram.ui.ActionBar.f6.X0(wallPaperSettings.background_color) && wallpapersListActivity.Q == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.R == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.S == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.Q == 0 || wallpapersListActivity.R != 0 || wallpapersListActivity.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.f6.R0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.U) <= 0.001f)))) ? tL_wallPaper : null;
                j10 = tL_wallPaper.id;
            } else if (obj2 instanceof xh1) {
                xh1 xh1Var = (xh1) obj2;
                if (!"d".equals(xh1Var.a) || (str = wallpapersListActivity.O) == null || !str.equals(xh1Var.a)) {
                    if (xh1Var.b == wallpapersListActivity.P) {
                        int i17 = xh1Var.c;
                        int i18 = wallpapersListActivity.Q;
                        if (i17 == i18) {
                            if (xh1Var.d == wallpapersListActivity.R) {
                                if (xh1Var.e == wallpapersListActivity.S) {
                                    if (i18 != 0) {
                                    }
                                    if ("c".equals(wallpapersListActivity.O)) {
                                    }
                                    if (!"c".equals(wallpapersListActivity.O)) {
                                        if (TextUtils.equals(wallpapersListActivity.O, xh1Var.a)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj = null;
                    wallPaper = xh1Var.l;
                    if (wallPaper != null) {
                        j10 = wallPaper.id;
                    }
                    j10 = 0;
                }
                obj = obj2;
                wallPaper = xh1Var.l;
                if (wallPaper != null) {
                }
                j10 = 0;
            } else if (obj2 instanceof yh1) {
                obj = wallpapersListActivity.O.equals(((yh1) obj2).a) ? obj2 : null;
                j10 = 0;
            } else {
                j10 = 0;
                obj = null;
            }
            zaVar.e(wallpapersListActivity.v, obj2, obj, i15);
            kVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
            if (kVar.s()) {
                zaVar.c(i15, wallpapersListActivity.e0.indexOfKey(j10) >= 0, !wallpapersListActivity.f0);
            } else {
                zaVar.c(i15, false, !wallpapersListActivity.f0);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.c;
        return new org.telegram.ui.Components.ik0(i9 != 0 ? i9 != 1 ? i9 != 3 ? new org.telegram.ui.Components.xi(this, context, 1) : new org.telegram.ui.Cells.b9(context) : new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null) : new org.telegram.ui.Cells.p8(context));
    }
}
