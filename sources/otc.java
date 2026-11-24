// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class otc extends q59 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public otc(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 0;
    }

    @Override // y59
    public final int b() {
        return this.d.a;
    }

    @Override // y59
    public final int d(int i) {
        int i2;
        WallpapersListActivity wallpapersListActivity = this.d;
        i2 = wallpapersListActivity.uploadImageRow;
        if (i == i2 || i == wallpapersListActivity.h || i == wallpapersListActivity.b || i == wallpapersListActivity.e) {
            return 0;
        }
        return (i == wallpapersListActivity.f || i == wallpapersListActivity.n) ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x014c, code lost:
    
        if (((int) (r6.h * 100.0f)) == ((int) (r13.V * 100.0f))) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0122, code lost:
    
        if (r6.f == r13.U) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0130, code lost:
    
        if (r6.a == null) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        int i2;
        long j;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        rja rjaVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.b0;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 == 0) {
            xib xibVar = (xib) view;
            i2 = wallpapersListActivity.uploadImageRow;
            if (i == i2) {
                xibVar.o(R.drawable.msg_photos, jb6.M0(2131745390, null), true);
                return;
            }
            if (i == wallpapersListActivity.b) {
                xibVar.o(R.drawable.msg_palette, jb6.M0(2131745272, null), false);
                return;
            }
            if (i == wallpapersListActivity.e) {
                xibVar.k(jb6.M0(2131745841, null), false);
                return;
            } else {
                if (i == wallpapersListActivity.h) {
                    xibVar.o(R.drawable.msg_background, "Choose from gallery", false);
                    xibVar.j(10);
                    return;
                }
                return;
            }
        }
        if (i3 != 2) {
            if (i3 == 3) {
                njb njbVar = (njb) view;
                if (i == wallpapersListActivity.f) {
                    njbVar.setText(jb6.M0(2131745838, null));
                    return;
                } else {
                    if (i == wallpapersListActivity.n) {
                        njbVar.setText("Upload your own background for the channel.");
                        return;
                    }
                    return;
                }
            }
            return;
        }
        ssc sscVar = (ssc) view;
        int i4 = i - wallpapersListActivity.c;
        byte b = wallpapersListActivity.O;
        int i5 = i4 * b;
        sscVar.d(b, i5 == 0, i5 / b == wallpapersListActivity.d - 1);
        for (int i6 = 0; i6 < wallpapersListActivity.O; i6++) {
            int i7 = i5 + i6;
            Object obj2 = i7 < arrayList.size() ? arrayList.get(i7) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                xlb xlbVar = cmb.I.j0;
                obj = (wallpapersListActivity.P.equals(tL_wallPaper.slug) && (!wallpapersListActivity.P.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.Q == cmb.Y0(wallPaperSettings.background_color) && wallpapersListActivity.R == cmb.Y0(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.S == cmb.Y0(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.T == cmb.Y0(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.R == 0 || wallpapersListActivity.S != 0 || wallpapersListActivity.U == gm.q1(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(cmb.S0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.V) <= 0.001f)))) ? tL_wallPaper : null;
                j = tL_wallPaper.id;
            } else {
                j = 0;
                if (obj2 instanceof mtc) {
                    mtc mtcVar = (mtc) obj2;
                    if (!"d".equals(mtcVar.a) || (str = wallpapersListActivity.P) == null || !str.equals(mtcVar.a)) {
                        if (mtcVar.b == wallpapersListActivity.Q) {
                            int i8 = mtcVar.c;
                            int i9 = wallpapersListActivity.R;
                            if (i8 == i9) {
                                if (mtcVar.d == wallpapersListActivity.S) {
                                    if (mtcVar.e == wallpapersListActivity.T) {
                                        if (i9 != 0) {
                                        }
                                        if ("c".equals(wallpapersListActivity.P)) {
                                        }
                                        if (!"c".equals(wallpapersListActivity.P)) {
                                            if (TextUtils.equals(wallpapersListActivity.P, mtcVar.a)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = null;
                        wallPaper = mtcVar.k;
                        if (wallPaper != null) {
                            j = wallPaper.id;
                        }
                    }
                    obj = obj2;
                    wallPaper = mtcVar.k;
                    if (wallPaper != null) {
                    }
                } else {
                    obj = ((obj2 instanceof ntc) && wallpapersListActivity.P.equals(((ntc) obj2).a)) ? obj2 : null;
                }
            }
            sscVar.e(obj2, wallpapersListActivity.r ? 1 : 0, i6, obj);
            rjaVar = ((d) wallpapersListActivity).simpleActionBar;
            if (rjaVar.x()) {
                sscVar.c(i6, wallpapersListActivity.f0.indexOfKey(j) >= 0, !wallpapersListActivity.g0);
            } else {
                sscVar.c(i6, false, !wallpapersListActivity.g0);
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View xibVar;
        Context context = this.c;
        if (i == 0) {
            xibVar = new xib(context);
        } else if (i != 3) {
            xibVar = new g32(this, context, (byte) 1);
            xibVar.setTag(-33024);
        } else {
            xibVar = new njb(context);
        }
        return new b59(xibVar);
    }
}
