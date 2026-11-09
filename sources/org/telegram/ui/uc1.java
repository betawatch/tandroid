package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uc1 extends org.telegram.ui.Components.pj0 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public uc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.a;
    }

    @Override // v4.g0
    public final int d(int i7) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i7 == i10 || i7 == wallpapersListActivity.h || i7 == wallpapersListActivity.b || i7 == wallpapersListActivity.e) {
            return 0;
        }
        return (i7 == wallpapersListActivity.f || i7 == wallpapersListActivity.n) ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x015b, code lost:
    
        if (((int) (r10.h * 100.0f)) == ((int) (r3.U * 100.0f))) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012e, code lost:
    
        if (r10.f == r3.T) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x013d, code lost:
    
        if (r10.a == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        long j3;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.ui.ActionBar.y4 y4Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.a0;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            i10 = wallpapersListActivity.uploadImageRow;
            if (i7 == i10) {
                m8Var.o(R.drawable.msg_photos, org.telegram.messenger.id.M0(2131745656, null), true);
                return;
            }
            if (i7 == wallpapersListActivity.b) {
                m8Var.o(R.drawable.msg_palette, org.telegram.messenger.id.M0(2131745538, null), false);
                return;
            }
            if (i7 == wallpapersListActivity.e) {
                m8Var.k(org.telegram.messenger.id.M0(2131746108, null), false);
                return;
            } else {
                if (i7 == wallpapersListActivity.h) {
                    m8Var.o(R.drawable.msg_background, "Choose from gallery", false);
                    m8Var.j(10);
                    return;
                }
                return;
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == wallpapersListActivity.f) {
                z8Var.setText(org.telegram.messenger.id.M0(2131746105, null));
                return;
            } else {
                if (i7 == wallpapersListActivity.n) {
                    z8Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
        int i12 = i7 - wallpapersListActivity.c;
        int i13 = wallpapersListActivity.N;
        int i14 = i12 * i13;
        uaVar.d(i13, i14 == 0, i14 / i13 == wallpapersListActivity.d - 1);
        for (int i15 = 0; i15 < wallpapersListActivity.N; i15++) {
            int i16 = i14 + i15;
            Object obj2 = i16 < arrayList.size() ? arrayList.get(i16) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = org.telegram.ui.ActionBar.l6.I.i0;
                obj = (wallpapersListActivity.O.equals(tL_wallPaper.slug) && (!wallpapersListActivity.O.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.P == org.telegram.ui.ActionBar.l6.a1(wallPaperSettings.background_color) && wallpapersListActivity.Q == org.telegram.ui.ActionBar.l6.a1(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.R == org.telegram.ui.ActionBar.l6.a1(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.S == org.telegram.ui.ActionBar.l6.a1(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.Q == 0 || wallpapersListActivity.R != 0 || wallpapersListActivity.T == org.telegram.messenger.g0.s1(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.l6.U0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.U) <= 0.001f)))) ? tL_wallPaper : null;
                j3 = tL_wallPaper.id;
            } else {
                j3 = 0;
                if (obj2 instanceof sc1) {
                    sc1 sc1Var = (sc1) obj2;
                    if (!"d".equals(sc1Var.a) || (str = wallpapersListActivity.O) == null || !str.equals(sc1Var.a)) {
                        if (sc1Var.b == wallpapersListActivity.P) {
                            int i17 = sc1Var.c;
                            int i18 = wallpapersListActivity.Q;
                            if (i17 == i18) {
                                if (sc1Var.d == wallpapersListActivity.R) {
                                    if (sc1Var.e == wallpapersListActivity.S) {
                                        if (i18 != 0) {
                                        }
                                        if ("c".equals(wallpapersListActivity.O)) {
                                        }
                                        if (!"c".equals(wallpapersListActivity.O)) {
                                            if (TextUtils.equals(wallpapersListActivity.O, sc1Var.a)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = null;
                        wallPaper = sc1Var.l;
                        if (wallPaper != null) {
                            j3 = wallPaper.id;
                        }
                    }
                    obj = obj2;
                    wallPaper = sc1Var.l;
                    if (wallPaper != null) {
                    }
                } else {
                    obj = ((obj2 instanceof tc1) && wallpapersListActivity.O.equals(((tc1) obj2).a)) ? obj2 : null;
                }
            }
            uaVar.e(wallpapersListActivity.r, obj2, obj, i15);
            y4Var = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
            if (y4Var.t()) {
                uaVar.c(i15, wallpapersListActivity.e0.indexOfKey(j3) >= 0, !wallpapersListActivity.f0);
            } else {
                uaVar.c(i15, false, !wallpapersListActivity.f0);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View m8Var;
        Context context = this.c;
        if (i7 == 0) {
            m8Var = new org.telegram.ui.Cells.m8(context);
        } else if (i7 != 3) {
            m8Var = new org.telegram.ui.Components.pi(this, context, 1);
            m8Var.setTag(-33024);
        } else {
            m8Var = new org.telegram.ui.Cells.z8(context);
        }
        return new org.telegram.ui.Components.yi0(m8Var);
    }
}
