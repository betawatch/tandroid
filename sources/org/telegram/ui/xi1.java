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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xi1 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public xi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 0;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.a;
    }

    @Override // f2.p0
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 == i11 || i10 == wallpapersListActivity.r || i10 == wallpapersListActivity.b || i10 == wallpapersListActivity.h) {
            return 0;
        }
        if (i10 == wallpapersListActivity.c || i10 == wallpapersListActivity.f) {
            return 1;
        }
        return (i10 == wallpapersListActivity.n || i10 == wallpapersListActivity.s) ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0158, code lost:
    
        if (((int) (r9.h * 100.0f)) == ((int) (r3.V * 100.0f))) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012b, code lost:
    
        if (r9.f == r3.U) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013a, code lost:
    
        if (r9.a == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        long j10;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.b0;
        int i12 = m1Var.f;
        View view = m1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            i11 = wallpapersListActivity.uploadImageRow;
            if (i10 == i11) {
                o8Var.m(R.drawable.msg_photos, LocaleController.getString(R.string.SelectFromGallery), true);
                return;
            }
            if (i10 == wallpapersListActivity.b) {
                o8Var.m(R.drawable.msg_palette, LocaleController.getString(R.string.SetColor), true);
                return;
            }
            if (i10 == wallpapersListActivity.h) {
                o8Var.i(LocaleController.getString(R.string.ResetChatBackgrounds), false);
                return;
            } else {
                if (i10 == wallpapersListActivity.r) {
                    o8Var.m(R.drawable.msg_background, "Choose from gallery", false);
                    o8Var.h(10);
                    return;
                }
                return;
            }
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == wallpapersListActivity.n) {
                a9Var.setText(LocaleController.getString(R.string.ResetChatBackgroundsInfo));
                return;
            } else {
                if (i10 == wallpapersListActivity.s) {
                    a9Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
        int i13 = i10 - wallpapersListActivity.d;
        int i14 = wallpapersListActivity.O;
        int i15 = i13 * i14;
        zaVar.d(i14, i15 == 0, i15 / i14 == wallpapersListActivity.e - 1);
        for (int i16 = 0; i16 < wallpapersListActivity.O; i16++) {
            int i17 = i15 + i16;
            Object obj2 = i17 < arrayList.size() ? arrayList.get(i17) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = org.telegram.ui.ActionBar.k6.I.f0;
                obj = (wallpapersListActivity.P.equals(tL_wallPaper.slug) && (!wallpapersListActivity.P.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.Q == org.telegram.ui.ActionBar.k6.X0(wallPaperSettings.background_color) && wallpapersListActivity.R == org.telegram.ui.ActionBar.k6.X0(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.S == org.telegram.ui.ActionBar.k6.X0(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.T == org.telegram.ui.ActionBar.k6.X0(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.R == 0 || wallpapersListActivity.S != 0 || wallpapersListActivity.U == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.k6.R0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.V) <= 0.001f)))) ? tL_wallPaper : null;
                j10 = tL_wallPaper.id;
            } else if (obj2 instanceof vi1) {
                vi1 vi1Var = (vi1) obj2;
                if (!"d".equals(vi1Var.a) || (str = wallpapersListActivity.P) == null || !str.equals(vi1Var.a)) {
                    if (vi1Var.b == wallpapersListActivity.Q) {
                        int i18 = vi1Var.c;
                        int i19 = wallpapersListActivity.R;
                        if (i18 == i19) {
                            if (vi1Var.d == wallpapersListActivity.S) {
                                if (vi1Var.e == wallpapersListActivity.T) {
                                    if (i19 != 0) {
                                    }
                                    if ("c".equals(wallpapersListActivity.P)) {
                                    }
                                    if (!"c".equals(wallpapersListActivity.P)) {
                                        if (TextUtils.equals(wallpapersListActivity.P, vi1Var.a)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj = null;
                    wallPaper = vi1Var.l;
                    if (wallPaper != null) {
                        j10 = wallPaper.id;
                    }
                    j10 = 0;
                }
                obj = obj2;
                wallPaper = vi1Var.l;
                if (wallPaper != null) {
                }
                j10 = 0;
            } else if (obj2 instanceof wi1) {
                obj = wallpapersListActivity.P.equals(((wi1) obj2).a) ? obj2 : null;
                j10 = 0;
            } else {
                j10 = 0;
                obj = null;
            }
            zaVar.e(wallpapersListActivity.v, obj2, obj, i16);
            kVar = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
            if (kVar.s()) {
                zaVar.c(i16, wallpapersListActivity.f0.indexOfKey(j10) >= 0, !wallpapersListActivity.g0);
            } else {
                zaVar.c(i16, false, !wallpapersListActivity.g0);
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return new org.telegram.ui.Components.el0(i10 != 0 ? i10 != 1 ? i10 != 3 ? new org.telegram.ui.Components.aj(this, context, 1) : new org.telegram.ui.Cells.a9(context) : new org.telegram.ui.Cells.z6(context, (b) null) : new org.telegram.ui.Cells.o8(context));
    }
}
