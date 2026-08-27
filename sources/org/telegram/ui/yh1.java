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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yh1 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public yh1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 0;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.a;
    }

    @Override // f2.q0
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
    
        if (((int) (r9.h * 100.0f)) == ((int) (r3.U * 100.0f))) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012b, code lost:
    
        if (r9.f == r3.T) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013a, code lost:
    
        if (r9.a == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        long j10;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.ui.ActionBar.k kVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.a0;
        int i12 = o1Var.f;
        View view = o1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            i11 = wallpapersListActivity.uploadImageRow;
            if (i10 == i11) {
                l8Var.m(R.drawable.msg_photos, LocaleController.getString(R.string.SelectFromGallery), true);
                return;
            }
            if (i10 == wallpapersListActivity.b) {
                l8Var.m(R.drawable.msg_palette, LocaleController.getString(R.string.SetColor), true);
                return;
            }
            if (i10 == wallpapersListActivity.h) {
                l8Var.i(LocaleController.getString(R.string.ResetChatBackgrounds), false);
                return;
            } else {
                if (i10 == wallpapersListActivity.r) {
                    l8Var.m(R.drawable.msg_background, "Choose from gallery", false);
                    l8Var.h(10);
                    return;
                }
                return;
            }
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == wallpapersListActivity.n) {
                x8Var.setText(LocaleController.getString(R.string.ResetChatBackgroundsInfo));
                return;
            } else {
                if (i10 == wallpapersListActivity.s) {
                    x8Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
        int i13 = i10 - wallpapersListActivity.d;
        int i14 = wallpapersListActivity.N;
        int i15 = i13 * i14;
        waVar.d(i14, i15 == 0, i15 / i14 == wallpapersListActivity.e - 1);
        for (int i16 = 0; i16 < wallpapersListActivity.N; i16++) {
            int i17 = i15 + i16;
            Object obj2 = i17 < arrayList.size() ? arrayList.get(i17) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.e0;
                obj = (wallpapersListActivity.O.equals(tL_wallPaper.slug) && (!wallpapersListActivity.O.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.P == org.telegram.ui.ActionBar.g6.X0(wallPaperSettings.background_color) && wallpapersListActivity.Q == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.R == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.S == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.Q == 0 || wallpapersListActivity.R != 0 || wallpapersListActivity.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.g6.R0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.U) <= 0.001f)))) ? tL_wallPaper : null;
                j10 = tL_wallPaper.id;
            } else if (obj2 instanceof wh1) {
                wh1 wh1Var = (wh1) obj2;
                if (!"d".equals(wh1Var.a) || (str = wallpapersListActivity.O) == null || !str.equals(wh1Var.a)) {
                    if (wh1Var.b == wallpapersListActivity.P) {
                        int i18 = wh1Var.c;
                        int i19 = wallpapersListActivity.Q;
                        if (i18 == i19) {
                            if (wh1Var.d == wallpapersListActivity.R) {
                                if (wh1Var.e == wallpapersListActivity.S) {
                                    if (i19 != 0) {
                                    }
                                    if ("c".equals(wallpapersListActivity.O)) {
                                    }
                                    if (!"c".equals(wallpapersListActivity.O)) {
                                        if (TextUtils.equals(wallpapersListActivity.O, wh1Var.a)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj = null;
                    wallPaper = wh1Var.l;
                    if (wallPaper != null) {
                        j10 = wallPaper.id;
                    }
                    j10 = 0;
                }
                obj = obj2;
                wallPaper = wh1Var.l;
                if (wallPaper != null) {
                }
                j10 = 0;
            } else if (obj2 instanceof xh1) {
                obj = wallpapersListActivity.O.equals(((xh1) obj2).a) ? obj2 : null;
                j10 = 0;
            } else {
                j10 = 0;
                obj = null;
            }
            waVar.e(wallpapersListActivity.v, obj2, obj, i16);
            kVar = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
            if (kVar.t()) {
                waVar.c(i16, wallpapersListActivity.e0.indexOfKey(j10) >= 0, !wallpapersListActivity.f0);
            } else {
                waVar.c(i16, false, !wallpapersListActivity.f0);
            }
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return new org.telegram.ui.Components.lk0(i10 != 0 ? i10 != 1 ? i10 != 3 ? new org.telegram.ui.Components.ti(this, context, 1) : new org.telegram.ui.Cells.x8(context) : new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null) : new org.telegram.ui.Cells.l8(context));
    }
}
