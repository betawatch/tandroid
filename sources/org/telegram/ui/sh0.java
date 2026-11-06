package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sh0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.ui.Components.mj, org.telegram.messenger.ls {
    public int D;
    public int E;
    public int F;
    public qh0 G;
    public boolean H;
    public final SparseArray I;
    public org.telegram.ui.Components.kn J;
    public long K;
    public int L;
    public qh0 M;
    public org.telegram.ui.Components.di N;
    public Ringtone O;
    public long P;
    public int Q;
    public int R;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public org.telegram.ui.Components.pj0 d;
    public bi.k5 e;
    public final org.telegram.ui.ActionBar.f6 f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public sh0(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.F = 100;
        this.I = new SparseArray();
        this.L = -1;
        this.P = 0L;
        this.f = f6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:15:0x0052, B:17:0x0059, B:21:0x0074, B:23:0x0078, B:25:0x007c, B:26:0x0095, B:28:0x0099, B:30:0x009f, B:34:0x00b2, B:36:0x00c3, B:38:0x00c9, B:39:0x00e2), top: B:14:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(sh0 sh0Var, Context context, View view, int i7) {
        sh0 sh0Var2;
        Context context2;
        File file;
        if (i7 == sh0Var.s) {
            sh0Var2 = sh0Var;
            context2 = context;
            org.telegram.ui.Components.di diVar = new org.telegram.ui.Components.di(context2, sh0Var2, false, false, true, sh0Var.f);
            sh0Var2.N = diVar;
            diVar.E1 = true;
            diVar.r3.setVisibility(8);
            diVar.d3.setText(org.telegram.messenger.hd.M0(2131752121, null));
            sh0Var2.N.e1();
            sh0Var2.N.show();
        } else {
            sh0Var2 = sh0Var;
            context2 = context;
        }
        if (view instanceof rh0) {
            rh0 rh0Var = (rh0) view;
            if (sh0Var2.simpleActionBar.s() || rh0Var.e == null) {
                sh0Var2.e0(rh0Var.e);
                return;
            }
            Ringtone ringtone = sh0Var2.O;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                qh0 qh0Var = rh0Var.e;
                if (qh0Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    sh0Var2.O = ringtone2;
                    ringtone2.play();
                } else {
                    String str = qh0Var.g;
                    if (str != null && !qh0Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(rh0Var.e.g));
                        ringtone3.setStreamType(4);
                        sh0Var2.O = ringtone3;
                        ringtone3.play();
                    } else if (qh0Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(rh0Var.e.g);
                            if (file.exists()) {
                                if (file == null) {
                                    org.telegram.messenger.w7 fileLoader = sh0Var2.getFileLoader();
                                    TLRPC.Document document = rh0Var.e.e;
                                    fileLoader.getClass();
                                    file = org.telegram.messenger.w7.I(document);
                                }
                                if (file == null && file.exists()) {
                                    Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                                    ringtone4.setStreamType(4);
                                    sh0Var2.O = ringtone4;
                                    ringtone4.play();
                                } else {
                                    org.telegram.messenger.w7 fileLoader2 = sh0Var2.getFileLoader();
                                    TLRPC.Document document2 = rh0Var.e.e;
                                    fileLoader2.X(document2, document2, 3, 0);
                                }
                            }
                        }
                        file = null;
                        if (file == null) {
                        }
                        if (file == null) {
                        }
                        org.telegram.messenger.w7 fileLoader22 = sh0Var2.getFileLoader();
                        TLRPC.Document document22 = rh0Var.e.e;
                        fileLoader22.X(document22, document22, 3, 0);
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            sh0Var2.M = null;
            sh0Var2.G = rh0Var.e;
            sh0Var2.H = true;
            bi.k5 k5Var = sh0Var2.e;
            k5Var.k(0, ((sh0) k5Var.d).h);
        }
    }

    public static void b0(sh0 sh0Var) {
        sh0Var.I.clear();
        bi.k5 k5Var = sh0Var.e;
        k5Var.k(0, ((sh0) k5Var.d).h);
        sh0Var.h0();
    }

    public static void f0(View view, int i7, int i10) {
        if (view instanceof org.telegram.ui.Cells.i2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            for (int i11 = 0; i11 < i2Var.getChildCount(); i11++) {
                View childAt = i2Var.getChildAt(i11);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.xp) {
                        org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) imageView.getDrawable();
                        Drawable drawable = xpVar.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = xpVar.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String g0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : org.telegram.messenger.hd.a0("SoundNameEmpty", null, 2131745279, org.telegram.messenger.hd.u(document.date, true));
    }

    @Override // org.telegram.ui.Components.mj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ph0(this, context));
        if (this.K == 0) {
            int i7 = this.L;
            if (i7 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747867, null));
            } else if (i7 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747868, null));
            } else if (i7 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747869, null));
            } else if (i7 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747865, null));
            } else if (i7 == 5 || i7 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747866, null));
            }
        } else {
            this.J = new org.telegram.ui.Components.kn(context, null, false, this.f);
            if (this.K >= 0) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.K));
                if (a22 != null) {
                    this.J.setUserAvatar(a22);
                    this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                }
            } else if (this.P != 0) {
                TLRPC.TL_forumTopic f10 = getMessagesController().q7.f(-this.K, this.P);
                qg.d.p(this.J.getAvatarImageView(), f10, false, true, this.f);
                this.simpleActionBar.setTitle(f10.title);
            } else {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.K));
                this.J.setChatAvatar(M0);
                this.simpleActionBar.setTitle(M0.title);
            }
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.M0(2131747870, null));
            org.telegram.messenger.g0.E2(this.J.e);
            this.simpleActionBar.addView(this.J.e, c8.ha.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
        l10.d(2, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131745460, null));
        l10.d(1, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751599, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.d = pj0Var;
        pj0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        bi.k5 k5Var = new bi.k5(this, 7);
        this.e = k5Var;
        k5Var.C(true);
        this.d.setAdapter(this.e);
        ((v4.k) this.d.getItemAnimator()).m = false;
        ((v4.k) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new v4.b0());
        this.d.setOnItemClickListener(new di.p4(20, this, context));
        this.d.setOnItemLongClickListener(new wr(this, 27));
        getMediaDataController().z0.g(false);
        this.a.clear();
        this.b.clear();
        for (int i10 = 0; i10 < getMediaDataController().z0.e.size(); i10++) {
            yf.b bVar = (yf.b) getMediaDataController().z0.e.get(i10);
            qh0 qh0Var = new qh0();
            int i11 = this.F;
            this.F = i11 + 1;
            qh0Var.c = i11;
            qh0Var.a = true;
            qh0Var.d = bVar.c;
            TLRPC.Document document3 = bVar.a;
            String str = document3.file_name_fixed;
            qh0Var.f = str;
            qh0Var.e = document3;
            qh0Var.f = g0(document3, str);
            qh0Var.g = bVar.b;
            qh0 qh0Var2 = this.M;
            if (qh0Var2 != null && (document = qh0Var2.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                this.M = null;
                this.G = qh0Var;
            }
            this.a.add(qh0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.t0.b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        qh0 qh0Var3 = new qh0();
        int i12 = this.F;
        this.F = i12 + 1;
        qh0Var3.c = i12;
        qh0Var3.f = org.telegram.messenger.hd.M0(2131748150, null);
        this.b.add(qh0Var3);
        qh0 qh0Var4 = new qh0();
        int i13 = this.F;
        this.F = i13 + 1;
        qh0Var4.c = i13;
        qh0Var4.f = org.telegram.messenger.hd.M0(2131751600, null);
        qh0Var4.b = true;
        this.b.add(qh0Var4);
        qh0 qh0Var5 = this.M;
        if (qh0Var5 != null && qh0Var5.e == null && qh0Var5.g.equals("NoSound")) {
            this.M = null;
            this.G = qh0Var3;
        }
        qh0 qh0Var6 = this.M;
        if (qh0Var6 != null && qh0Var6.e == null && qh0Var6.g.equals("Default")) {
            this.M = null;
            this.G = qh0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            qh0 qh0Var7 = new qh0();
            int i14 = this.F;
            this.F = i14 + 1;
            qh0Var7.c = i14;
            qh0Var7.f = string;
            qh0Var7.g = str2;
            qh0 qh0Var8 = this.M;
            if (qh0Var8 != null && qh0Var8.e == null && qh0Var8.g.equals(str2)) {
                this.M = null;
                this.G = qh0Var7;
            }
            this.b.add(qh0Var7);
        }
        if (getMediaDataController().z0.f && this.G == null) {
            this.G = qh0Var4;
            this.H = true;
        }
        i0();
        i0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i7 == org.telegram.messenger.qs.e5) {
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (true) {
                arrayList = this.a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((qh0) arrayList.get(i11)).d), (qh0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            for (int i12 = 0; i12 < getMediaDataController().z0.e.size(); i12++) {
                yf.b bVar = (yf.b) getMediaDataController().z0.e.get(i12);
                qh0 qh0Var = new qh0();
                qh0 qh0Var2 = (qh0) hashMap.get(Integer.valueOf(bVar.c));
                if (qh0Var2 != null) {
                    if (qh0Var2 == this.G) {
                        this.G = qh0Var;
                    }
                    qh0Var.c = qh0Var2.c;
                } else {
                    int i13 = this.F;
                    this.F = i13 + 1;
                    qh0Var.c = i13;
                }
                qh0Var.a = true;
                qh0Var.d = bVar.c;
                TLRPC.Document document3 = bVar.a;
                if (document3 != null) {
                    qh0Var.f = document3.file_name_fixed;
                } else {
                    qh0Var.f = new File(bVar.b).getName();
                }
                TLRPC.Document document4 = bVar.a;
                qh0Var.e = document4;
                qh0Var.f = g0(document4, qh0Var.f);
                qh0Var.g = bVar.b;
                qh0 qh0Var3 = this.M;
                if (qh0Var3 != null && (document = qh0Var3.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                    this.M = null;
                    this.G = qh0Var;
                }
                arrayList.add(qh0Var);
            }
            i0();
            this.e.f();
            if (getMediaDataController().z0.f && this.G == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.M = null;
                    this.G = (qh0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(qh0 qh0Var) {
        int i7 = qh0Var.c;
        SparseArray sparseArray = this.I;
        if (sparseArray.get(i7) != null) {
            sparseArray.remove(qh0Var.c);
        } else if (!qh0Var.a) {
            return;
        } else {
            sparseArray.put(qh0Var.c, qh0Var);
        }
        h0();
        bi.k5 k5Var = this.e;
        k5Var.k(0, ((sh0) k5Var.d).h);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f;
    }

    public final void h0() {
        SparseArray sparseArray = this.I;
        if (sparseArray.size() <= 0) {
            this.simpleActionBar.r();
        } else {
            this.simpleActionBar.x(sparseArray.size(), this.simpleActionBar.s());
            this.simpleActionBar.B();
        }
    }

    public final void i0() {
        this.n = -1;
        this.r = -1;
        this.s = -1;
        this.w = -1;
        this.y = -1;
        this.D = -1;
        this.E = -1;
        this.h = 1;
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            int i7 = this.h;
            this.n = i7;
            int size = arrayList.size() + i7;
            this.h = size;
            this.r = size;
        }
        int i10 = this.h;
        this.s = i10;
        this.h = i10 + 2;
        this.w = i10 + 1;
        ArrayList arrayList2 = this.b;
        if (!arrayList2.isEmpty()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.h = i12;
            this.y = i11;
            this.D = i12;
            int size2 = arrayList2.size() + i12;
            this.h = size2;
            this.E = size2;
        }
        int i13 = this.h;
        this.h = i13 + 1;
        this.x = i13;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.mj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            getMediaDataController().l2((String) arrayList.get(i10));
        }
        getNotificationCenter().k(org.telegram.messenger.qs.e5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 != 21 || intent == null || this.N == null) {
            return;
        }
        Uri data = intent.getData();
        int i11 = org.telegram.messenger.qs.e5;
        boolean z9 = true;
        boolean z10 = false;
        if (data != null) {
            String T0 = org.telegram.messenger.g0.T0(intent.getData());
            if (T0 != null) {
                if (T0.startsWith("content://")) {
                    T0 = MediaController.t(-1L, intent.getData(), "mp3");
                }
                if (this.N.g2.Q(new File(T0))) {
                    getMediaDataController().l2(T0);
                    getNotificationCenter().k(i11, new Object[0]);
                    z10 = z9;
                }
            }
            z9 = false;
            z10 = z9;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            boolean z11 = false;
            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                Uri uri = clipData.getItemAt(i12).getUri();
                String uri2 = uri.toString();
                if (uri2.startsWith("content://")) {
                    uri2 = MediaController.t(-1L, uri, "mp3");
                }
                if (this.N.g2.Q(new File(uri2))) {
                    getMediaDataController().l2(uri2);
                    getNotificationCenter().k(i11, new Object[0]);
                    z11 = true;
                }
            }
            z10 = z11;
        }
        if (z10) {
            this.N.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.K = getArguments().getLong("dialog_id", 0L);
            this.P = getArguments().getLong("topic_id", 0L);
            this.L = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, -1);
        }
        long j3 = this.K;
        if (j3 != 0) {
            String v = org.telegram.messenger.dt.v(j3, this.P, false);
            str2 = rf.b.i("sound_document_id_", v);
            str = rf.b.i("sound_path_", v);
        } else {
            int i7 = this.L;
            if (i7 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i7 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i7 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i7 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else {
                if (i7 != 4 && i7 != 5) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j10 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        qh0 qh0Var = new qh0();
        this.M = qh0Var;
        if (j10 != 0) {
            qh0Var.e = new TLRPC.TL_document();
            this.M.e.id = j10;
        } else {
            qh0Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.G == null || !this.H) {
            return;
        }
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        if (this.K != 0) {
            str = "sound_" + org.telegram.messenger.dt.v(this.K, this.P, false);
            str2 = "sound_path_" + org.telegram.messenger.dt.v(this.K, this.P, false);
            str3 = "sound_document_id_" + org.telegram.messenger.dt.v(this.K, this.P, false);
            edit.putBoolean("sound_enabled_" + org.telegram.messenger.dt.v(this.K, this.P, false), true);
        } else {
            int i7 = this.L;
            if (i7 == 1) {
                str = "GlobalSound";
                str2 = "GlobalSoundPath";
                str3 = "GlobalSoundDocId";
            } else if (i7 == 0) {
                str = "GroupSound";
                str2 = "GroupSoundPath";
                str3 = "GroupSoundDocId";
            } else if (i7 == 2) {
                str = "ChannelSound";
                str2 = "ChannelSoundPath";
                str3 = "ChannelSoundDocId";
            } else if (i7 == 3) {
                str = "StoriesSound";
                str2 = "StoriesSoundPath";
                str3 = "StoriesSoundDocId";
            } else {
                if (i7 != 5 && i7 != 4) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSound";
                str2 = "ReactionSoundPath";
                str3 = "ReactionSoundDocId";
            }
        }
        qh0 qh0Var = this.G;
        if (qh0Var.a && (document = qh0Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.G.f);
            edit.putString(str2, "NoSound");
        } else if (qh0Var.g != null) {
            edit.putString(str, qh0Var.f);
            edit.putString(str2, this.G.g);
            edit.remove(str3);
        } else if (qh0Var.b) {
            edit.putString(str, "Default");
            edit.putString(str2, "Default");
            edit.remove(str3);
        } else {
            edit.putString(str, "NoSound");
            edit.putString(str2, "NoSound");
            edit.remove(str3);
        }
        edit.apply();
        if (this.K != 0) {
            getNotificationsController().c0(this.K, this.P, true);
        } else {
            getNotificationsController().b0(this.L);
            getNotificationCenter().k(org.telegram.messenger.qs.f0, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.qs.e5);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.qs.e5);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f;
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, f6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.k7, f6Var);
            if (this.d != null) {
                if (w02 == this.Q && w03 == this.R) {
                    return;
                }
                this.Q = w02;
                this.R = w03;
                for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
                    f0(this.d.getChildAt(i7), w02, w03);
                }
                for (int i10 = 0; i10 < this.d.getCachedChildCount(); i10++) {
                    f0(this.d.P(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.d.getHiddenChildCount(); i11++) {
                    f0(this.d.V(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.d.getAttachedScrapChildCount(); i12++) {
                    f0(this.d.O(i12), w02, w03);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.mj
    public final /* synthetic */ void S() {
    }

    @Override // org.telegram.ui.Components.mj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z9, int i7, long j3) {
    }
}
