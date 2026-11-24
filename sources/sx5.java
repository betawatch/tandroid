// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sx5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sx5(byte b, Object obj, Object obj2, TLObject tLObject) {
        this.a = b;
        this.b = obj;
        this.d = tLObject;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02d0, code lost:
    
        if (r0 != 16) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02db, code lost:
    
        if (r0 != 3) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e7, code lost:
    
        if (r0 == 16) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0405, code lost:
    
        if (r11 != 16) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0410, code lost:
    
        if (r11 != 3) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x041c, code lost:
    
        if (r11 == 16) goto L174;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x042f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ActionBarLayout actionBarLayout;
        byte b;
        int i;
        byte b2;
        byte b3;
        byte b4;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TLRPC.UserFull userFull = null;
        mx2 mx2Var = null;
        int i8 = 0;
        switch (this.a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                kz5 kz5Var = (kz5) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str = LaunchActivity.C1;
                try {
                    kz5Var.run();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (tLObject instanceof TLRPC.TL_help_deepLinkInfo) {
                    TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject;
                    ij.u0(launchActivity, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
                    break;
                }
                break;
            case 1:
                LaunchActivity launchActivity2 = (LaunchActivity) this.b;
                kz5 kz5Var2 = (kz5) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                String str2 = LaunchActivity.C1;
                try {
                    kz5Var2.run();
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        ij.u0(launchActivity2, k96.M0(2131743581, null), true);
                    } else {
                        launchActivity2.F0(ij.K(launchActivity2, null, k96.M0(2131751093, null) + "\n" + tL_error.text));
                    }
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 2:
                LaunchActivity launchActivity3 = (LaunchActivity) this.b;
                akb akbVar = (akb) this.c;
                File file = (File) this.d;
                String str3 = LaunchActivity.C1;
                akbVar.b(file, akbVar.c);
                gl.c3(new rx5(launchActivity3, (byte) 8));
                break;
            case 3:
                LaunchActivity launchActivity4 = (LaunchActivity) this.b;
                int[] iArr = (int[]) this.c;
                long[] jArr = (long[]) this.d;
                String str4 = LaunchActivity.C1;
                int i9 = iArr[0] - 1;
                iArr[0] = i9;
                if (i9 == 0) {
                    kk7.f(launchActivity4.P).k(kk7.x5, new Object[0]);
                    launchActivity4.p0(jArr, false);
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity5 = (LaunchActivity) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                akb akbVar2 = (akb) this.c;
                String str5 = LaunchActivity.C1;
                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                    launchActivity5.S0 = akbVar2;
                    launchActivity5.Q0 = ba4.r(null, tL_wallPaper.document);
                    launchActivity5.R0 = tL_wallPaper;
                    ba4.G(akbVar2.F).X(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                } else {
                    launchActivity5.i0();
                    break;
                }
            case 5:
                LaunchActivity launchActivity6 = (LaunchActivity) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                bz5 bz5Var = (bz5) this.d;
                String str6 = LaunchActivity.C1;
                na7.q1(launchActivity6.P).a4(user, true, false);
                bz5Var.a(user);
                break;
            case 6:
                zj zjVar = (zj) this.b;
                String str7 = (String) this.c;
                String str8 = (String) this.d;
                LaunchActivity launchActivity7 = (LaunchActivity) zjVar.b;
                String str9 = LaunchActivity.C1;
                if ("rebuild".equals(str7)) {
                    try {
                        launchActivity7.y0(true);
                        if (gl.O1() && (actionBarLayout = launchActivity7.r0) != null) {
                            actionBarLayout.W(true, true);
                        }
                        Log.i("tmessages", "DEBUG_THEME rebuilt fragment views");
                        break;
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                        return;
                    }
                } else if ("keys".equals(str7)) {
                    HashSet r = zkb.r();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = r.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (sb.length() > 0) {
                            sb.append(',');
                        }
                        sb.append(lve.c(intValue));
                    }
                    Log.i("tmessages", "DEBUG_THEME keys on screen (" + r.size() + "): " + ((Object) sb));
                    break;
                } else {
                    SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                    String str10 = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (bkb.O0(string) != null && !bkb.O0(string).o()) {
                        str10 = string;
                    }
                    String str11 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (bkb.O0(string2) != null && bkb.O0(string2).o()) {
                        str11 = string2;
                    }
                    boolean z = "night".equals(str7) || !("day".equals(str7) || bkb.I.o());
                    if (z) {
                        str10 = str11;
                    }
                    akb O0 = bkb.O0(str10);
                    StringBuilder sb2 = new StringBuilder("DEBUG_THEME ");
                    sb2.append(z ? "night" : "day");
                    sb2.append(" (");
                    sb2.append(O0.k());
                    sb2.append("), style ");
                    sb2.append(str8);
                    Log.i("tmessages", sb2.toString());
                    if ("instant".equals(str8)) {
                        kk7.e().k(kk7.v4, O0, Boolean.FALSE, null, -1);
                        break;
                    } else if ("fade".equals(str8)) {
                        bkb.I1(O0, false, -1, null);
                        break;
                    } else {
                        kk7.e().k(kk7.v4, O0, Boolean.FALSE, new int[]{launchActivity7.y0.getMeasuredWidth() / 2, launchActivity7.y0.getMeasuredHeight() / 2}, -1, Boolean.valueOf(z), null);
                        break;
                    }
                }
                break;
            case 7:
                a46 a46Var = (a46) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                String str12 = (String) this.c;
                a46Var.c();
                if (tLObject3 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject3;
                    if (!TwoStepVerificationActivity.a0(password, false)) {
                        ij.u0(a46Var.a, k96.M0(2131743581, null), true);
                    }
                    t36 t36Var = new t36(a46Var, str12, (byte) 2);
                    if (password.has_password) {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.J = password;
                        twoStepVerificationActivity.K = false;
                        a46Var.u(twoStepVerificationActivity, false);
                        t36Var.run();
                        break;
                    } else {
                        p3c p3cVar = new p3c(TextUtils.isEmpty(password.email_unconfirmed_pattern) ? (byte) 6 : (byte) 5, password);
                        p3cVar.k0 = t36Var;
                        a46Var.u(p3cVar, false);
                        break;
                    }
                }
                break;
            case 8:
                x36 x36Var = (x36) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.User user2 = (TLRPC.User) this.c;
                if (tLObject4 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject4;
                    x36Var.getMessagesController().b4(tL_users_userFull.users, false);
                    x36Var.getMessagesController().V3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                }
                TLRPC.UserFull userFull2 = userFull;
                rgc.m(user2, false, userFull2 != null && userFull2.video_calls_available, x36Var.getParentActivity(), userFull2, x36Var.getAccountInstance());
                break;
            case 9:
                l46 l46Var = (l46) this.b;
                m46 m46Var = (m46) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                k46 k46Var = l46Var.h;
                if (k46Var != null && l46Var.e == m46Var) {
                    k46Var.a(clickableSpan);
                    l46Var.e = null;
                    l46Var.b.e(true);
                    break;
                }
                break;
            case 10:
                t76 t76Var = (t76) this.b;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                int i10 = t76Var.e;
                if (!t76Var.w) {
                    if (tLObject5 instanceof TL_phone.groupCall) {
                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                        na7.q1(i10).b4(groupcall.users, false);
                        na7.q1(i10).V3(groupcall.chats, false);
                        t76Var.s = groupcall.call;
                        kk7.f(i10).k(kk7.F2, Long.valueOf(t76Var.s.id));
                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                        gl.c3(new r76(t76Var, r3));
                    }
                    if (t76Var.I) {
                        Runnable runnable = t76Var.K;
                        if (runnable != null) {
                            gl.r(runnable);
                        }
                        r76 r76Var = new r76(t76Var, (byte) 0);
                        t76Var.K = r76Var;
                        gl.d3(r76Var, t76Var.o() ? 5000 : 20000);
                        break;
                    }
                }
                break;
            case 11:
                int[] iArr2 = (int[]) this.b;
                int[] iArr3 = (int[]) this.c;
                Runnable runnable2 = (Runnable) this.d;
                int i11 = iArr2[0] + 1;
                iArr2[0] = i11;
                if (i11 >= iArr3[0] && runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 12:
                qa6 qa6Var = (qa6) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.d;
                ImageView imageView = new ImageView(qa6Var.getParentActivity());
                imageView.setImageBitmap(bitmap);
                ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
                try {
                    viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
                gl.d3(new sx5((Object) qa6Var, (Object) viewGroup, (Object) gLSurfaceView, (byte) 13), 100L);
                break;
            case 13:
                qa6 qa6Var2 = (qa6) this.b;
                try {
                    ((ViewGroup) this.c).removeView((GLSurfaceView) this.d);
                } catch (Exception e5) {
                    fa4.g(e5, true);
                }
                qa6Var2.J = true;
                qa6Var2.finishFragment();
                break;
            case 14:
                qa6 qa6Var3 = (qa6) this.b;
                hd[] hdVarArr = (hd[]) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                hdVarArr[0] = null;
                qa6Var3.M0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                qa6Var3.finishFragment();
                break;
            case 15:
                eb6 eb6Var = (eb6) this.b;
                db6 db6Var = (db6) this.c;
                db6 db6Var2 = (db6) this.d;
                ArrayList arrayList = eb6Var.J;
                if (db6Var != null) {
                    arrayList.remove(db6Var);
                }
                arrayList.add(db6Var2);
                eb6Var.K.k(db6Var2, db6Var2.a);
                eb6.q();
                kk7.e().k(kk7.F4, new Object[0]);
                break;
            case 16:
                ((mf6) this.b).E1((String) this.c, (TLRPC.auth_SentCode) this.d);
                break;
            case 17:
                ((mf6) this.b).p1((Bundle) this.c, (TLRPC.auth_SentCode) ((TLObject) this.d), true);
                break;
            case 18:
                qy qyVar = (qy) this.b;
                EditText editText = (EditText) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                editText.removeTextChangedListener(qyVar);
                editText.removeCallbacks((Runnable) atomicReference.get());
                ((Runnable) atomicReference.get()).run();
                break;
            case 19:
                ad6 ad6Var = (ad6) this.b;
                TLObject tLObject6 = (TLObject) this.d;
                Bundle bundle = (Bundle) this.c;
                mf6 mf6Var = ad6Var.a0;
                if (!(tLObject6 instanceof TL_account.TL_emailVerified) || mf6Var.G != 3) {
                    if (tLObject6 instanceof TL_account.TL_emailVerifiedLogin) {
                        mf6Var.p1(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject6).sent_code, true);
                        break;
                    } else if (tLObject6 instanceof TLRPC.TL_auth_authorization) {
                        mf6Var.B1((TLRPC.TL_auth_authorization) tLObject6, false);
                        break;
                    }
                } else {
                    mf6Var.finishFragment();
                    mf6Var.e0.run();
                    break;
                }
                break;
            case 20:
                ae6 ae6Var = (ae6) this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.c;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.d;
                TLRPC.FileLocation fileLocation = photoSize.location;
                ae6Var.O = fileLocation;
                ae6Var.P = photoSize2.location;
                ae6Var.e.m(gl5.e(fileLocation), "50_50", ae6Var.f, null);
                break;
            case 21:
                qe6 qe6Var = (qe6) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TL_account.confirmPhone confirmphone = (TL_account.confirmPhone) this.d;
                byte b5 = qe6Var.i0;
                mf6 mf6Var2 = qe6Var.v0;
                qe6Var.y(false);
                qe6Var.g0 = false;
                if (tL_error3 == null) {
                    Activity parentActivity = mf6Var2.getParentActivity();
                    if (parentActivity != null) {
                        qe6Var.o(new kz5(qe6Var, parentActivity, (byte) 21));
                        break;
                    }
                } else {
                    qe6Var.h0 = tL_error3.text;
                    if (b5 == 3) {
                        int i12 = qe6Var.j0;
                        if (i12 != 4) {
                            b = 2;
                            if (i12 != 2) {
                                if (i12 != 17) {
                                }
                            }
                        }
                        qe6Var.r();
                        if (b5 == 15) {
                            kk7.e().a(qe6Var, kk7.i4);
                        } else if (b5 == 2) {
                            gl.y3(true);
                            kk7.e().a(qe6Var, kk7.i4);
                        } else if (b5 == 3) {
                            gl.x3(true);
                            kk7.e().a(qe6Var, kk7.j4);
                        }
                        qe6Var.f0 = true;
                        if (b5 != 3) {
                            i = ((d) mf6Var2).currentAccount;
                            ij.c0(i, tL_error3, mf6Var2, confirmphone, new Object[0]);
                        }
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY") || tL_error3.text.contains("PHONE_CODE_INVALID")) {
                            qe6Var.w();
                            break;
                        } else if (tL_error3.text.contains("PHONE_CODE_EXPIRED")) {
                            qe6Var.d(true);
                            mf6Var2.I1(0, true, null, true);
                            break;
                        }
                    } else {
                        b = 2;
                    }
                    if (b5 == b) {
                        int i13 = qe6Var.j0;
                        b2 = 4;
                        if (i13 != 4) {
                        }
                        qe6Var.r();
                        if (b5 == 15) {
                        }
                        qe6Var.f0 = true;
                        if (b5 != 3) {
                        }
                        if (!tL_error3.text.contains("PHONE_CODE_EMPTY")) {
                        }
                        qe6Var.w();
                    } else {
                        b2 = 4;
                    }
                    if (b5 == b2) {
                        int i14 = qe6Var.j0;
                        if (i14 != b) {
                            if (i14 != 17) {
                            }
                        }
                        qe6Var.r();
                    }
                    if (b5 == 15) {
                    }
                    qe6Var.f0 = true;
                    if (b5 != 3) {
                    }
                    if (!tL_error3.text.contains("PHONE_CODE_EMPTY")) {
                    }
                    qe6Var.w();
                }
                break;
            case 22:
                qe6 qe6Var2 = (qe6) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                byte b6 = qe6Var2.i0;
                mf6 mf6Var3 = qe6Var2.v0;
                qe6Var2.y(false);
                qe6Var2.g0 = false;
                if (tL_error4 == null) {
                    TLRPC.User user3 = (TLRPC.User) tLObject7;
                    qe6Var2.t();
                    qe6Var2.s();
                    i2 = ((d) mf6Var3).currentAccount;
                    y6c.h(i2).v(user3);
                    i3 = ((d) mf6Var3).currentAccount;
                    y6c.h(i3).u(true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user3);
                    i4 = ((d) mf6Var3).currentAccount;
                    ad7.Y(i4).j1(arrayList2, null, true, true);
                    i5 = ((d) mf6Var3).currentAccount;
                    na7.q1(i5).a4(user3, false, false);
                    i6 = ((d) mf6Var3).currentAccount;
                    kk7.f(i6).k(46, new Object[0]);
                    mf6Var3.getMessagesController().n4(0L, "VALIDATE_PHONE_NUMBER");
                    if (b6 == 3) {
                        gl.T();
                    }
                    qe6Var2.o(new ee6(qe6Var2, r3));
                    break;
                } else {
                    qe6Var2.h0 = tL_error4.text;
                    qe6Var2.g0 = false;
                    mf6Var3.J1(false, true);
                    if (b6 == 3) {
                        int i15 = qe6Var2.j0;
                        if (i15 != 4) {
                            b3 = 2;
                            if (i15 != 2) {
                                if (i15 != 17) {
                                }
                            }
                        }
                        qe6Var2.r();
                        if (b6 == 15) {
                            kk7.e().a(qe6Var2, kk7.i4);
                        } else if (b6 == 2) {
                            gl.y3(true);
                            kk7.e().a(qe6Var2, kk7.i4);
                        } else if (b6 == 3) {
                            gl.x3(true);
                            kk7.e().a(qe6Var2, kk7.j4);
                        }
                        qe6Var2.f0 = true;
                        if (b6 != 3) {
                            if (tL_error4.text.contains("PHONE_NUMBER_INVALID")) {
                                mf6Var3.y1(k96.M0(2131745878, null), k96.M0(2131748987, "InvalidPhoneNumber"));
                            } else if (tL_error4.text.contains("PHONE_CODE_EMPTY") || tL_error4.text.contains("PHONE_CODE_INVALID")) {
                                qe6Var2.w();
                                break;
                            } else if (tL_error4.text.contains("PHONE_CODE_EXPIRED")) {
                                qe6Var2.d(true);
                                mf6Var3.I1(0, true, null, true);
                                mf6Var3.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                            } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                                mf6Var3.y1(k96.M0(2131745878, null), k96.M0(2131750670, "FloodWait"));
                            } else {
                                mf6Var3.y1(k96.M0(2131745878, null), k96.M0(2131751093, "ErrorOccurred") + "\n" + tL_error4.text);
                            }
                            int i16 = 0;
                            while (true) {
                                fj2 fj2Var = qe6Var2.f;
                                sj2[] sj2VarArr = fj2Var.f;
                                if (i16 >= sj2VarArr.length) {
                                    fj2Var.e = false;
                                    sj2VarArr[0].requestFocus();
                                    break;
                                } else {
                                    sj2VarArr[i16].setText("");
                                    i16++;
                                }
                            }
                        }
                    } else {
                        b3 = 2;
                    }
                    if (b6 == b3) {
                        int i17 = qe6Var2.j0;
                        b4 = 4;
                        if (i17 != 4) {
                        }
                        qe6Var2.r();
                        if (b6 == 15) {
                        }
                        qe6Var2.f0 = true;
                        if (b6 != 3) {
                        }
                    } else {
                        b4 = 4;
                    }
                    if (b6 == b4) {
                        int i18 = qe6Var2.j0;
                        if (i18 != b3) {
                            if (i18 != 17) {
                            }
                        }
                        qe6Var2.r();
                    }
                    if (b6 == 15) {
                    }
                    qe6Var2.f0 = true;
                    if (b6 != 3) {
                    }
                }
                break;
            case 23:
                qe6 qe6Var3 = (qe6) this.b;
                Bundle bundle2 = (Bundle) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                qe6Var3.r0 = bundle2;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject8;
                qe6Var3.s0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    qe6Var3.j0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    qe6Var3.j0 = 16;
                }
                qe6Var3.v0.p1(bundle2, tL_auth_sentCode, true);
                break;
            case 24:
                ve6 ve6Var = (ve6) this.b;
                TLObject tLObject9 = (TLObject) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                u41 u41Var = ve6Var.b;
                mf6 mf6Var4 = ve6Var.w;
                ve6Var.s = -1;
                if (tLObject9 instanceof TLRPC.auth_SentCode) {
                    ve6Var.f = false;
                    u41Var.setLoading(false);
                    ui5 parentLayout = mf6Var4.getParentLayout();
                    if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        d dVar = fragmentStack.isEmpty() ? null : (d) oo1.m(1, fragmentStack);
                        ArrayList arrayList3 = new ArrayList(fragmentStack);
                        int size = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj = arrayList3.get(i19);
                            i19++;
                            d dVar2 = (d) obj;
                            if ((dVar2 instanceof p) && dVar2 != dVar) {
                                dVar2.removeSelfFromStack();
                            }
                        }
                        if (dVar instanceof p) {
                            ((ActionBarLayout) parentLayout).j(true, false);
                        }
                    }
                    mf6Var4.p1(ve6Var.d, (TLRPC.auth_SentCode) tLObject9, true);
                    break;
                } else if (tL_error5 != null) {
                    String str13 = tL_error5.text;
                    if (str13 == null || !str13.startsWith("FLOOD_WAIT_")) {
                        String str14 = tL_error5.text;
                        if (str14 == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(str14)) {
                            ve6Var.e = tL_error5.text;
                            ve6Var.f = false;
                            u41Var.setLoading(false);
                            new u21(mf6Var4.a0, null).H(R.raw.error, k96.a0(null, null, 2131743639, tL_error5.text));
                            break;
                        } else {
                            mf6Var4.I1(0, true, null, true);
                            mf6Var4.y1(k96.M0(2131745878, null), k96.M0(2131752009, null));
                            break;
                        }
                    } else {
                        gl.d3(new re6(ve6Var, null == true ? 1 : 0), Integer.parseInt(tL_error5.text.substring(11)) * 1000);
                        break;
                    }
                }
                break;
            case 25:
                ve6 ve6Var2 = (ve6) this.b;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.c;
                TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) this.d;
                mf6 mf6Var5 = ve6Var2.w;
                mf6Var5.e = true;
                mf6 mf6Var6 = (mf6) LaunchActivity.M();
                if (mf6Var6 == null) {
                    i7 = ((d) mf6Var5).currentAccount;
                    mf6Var6 = new mf6(i7);
                    d S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(mf6Var6);
                    }
                }
                mf6Var6.E1(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
                break;
            case 26:
                lf6 lf6Var = (lf6) this.b;
                TLObject tLObject10 = (TLObject) this.d;
                HashMap hashMap = (HashMap) this.c;
                if6 if6Var = lf6Var.a;
                if (tLObject10 != null) {
                    TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject10;
                    if (if6Var.length() == 0) {
                        String upperCase = tL_nearestDc.country.toUpperCase();
                        ArrayList arrayList4 = lf6Var.H;
                        if (((String) hashMap.get(upperCase)) != null && arrayList4 != null) {
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList4.size()) {
                                    if (arrayList4.get(i20) == null || !((mx2) arrayList4.get(i20)).a.equals(upperCase)) {
                                        i20++;
                                    } else {
                                        mx2Var = (mx2) arrayList4.get(i20);
                                    }
                                }
                            }
                            if (mx2Var != null) {
                                if6Var.setText(mx2Var.c);
                                lf6Var.F = (byte) 0;
                                break;
                            }
                        }
                    }
                }
                break;
            case 27:
                yh6 yh6Var = (yh6) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                if (tL_error6 != null) {
                    yh6Var.getClass();
                    break;
                } else {
                    yh6 yh6Var2 = yh6Var.t0.a;
                    while (true) {
                        ArrayList arrayList5 = yh6Var2.k0;
                        if (i8 >= arrayList5.size()) {
                            break;
                        } else if (((TLRPC.TL_chatInviteExported) arrayList5.get(i8)).link.equals(tL_chatInviteExported.link)) {
                            qh6 k0 = yh6Var2.k0();
                            arrayList5.remove(i8);
                            yh6Var2.m0(k0);
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
            case 28:
                hq6 hq6Var = (hq6) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                en6 en6Var = (en6) this.d;
                for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                    k27 k27Var = (k27) arrayList6.get(i21);
                    TLRPC.TL_message c0 = hq6Var.getMessagesStorage().c0(k27Var.e1(), k27.B0(k27Var.k));
                    TLRPC.Message message = k27Var.k;
                    message.translatedToLanguage = c0.translatedToLanguage;
                    message.translatedText = c0.translatedText;
                    k27Var.f6(false);
                }
                en6Var.run();
                break;
            default:
                hq6 hq6Var2 = (hq6) this.b;
                String str15 = (String) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                hq6Var2.R.put(str15, tL_messages_stickerSet);
                hq6Var2.S.k(str15, tL_messages_stickerSet.set.id);
                hq6Var2.getNotificationCenter().k(61, str15);
                break;
        }
    }

    public /* synthetic */ sx5(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
