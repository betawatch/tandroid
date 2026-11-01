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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wi0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.ui.Components.nj, org.telegram.messenger.vs {
    public int D;
    public int E;
    public int F;
    public ui0 G;
    public boolean H;
    public final SparseArray I;
    public org.telegram.ui.Components.sn J;
    public long K;
    public int L;
    public ui0 M;
    public org.telegram.ui.Components.bi N;
    public Ringtone O;
    public long P;
    public int Q;
    public int R;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public org.telegram.ui.Components.uk0 d;
    public kg.f e;
    public final org.telegram.ui.ActionBar.p6 f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public wi0(Bundle bundle, org.telegram.ui.ActionBar.p6 p6Var) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.F = 100;
        this.I = new SparseArray();
        this.L = -1;
        this.P = 0L;
        this.f = p6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:15:0x0052, B:17:0x0059, B:21:0x0074, B:23:0x0078, B:25:0x007c, B:26:0x0095, B:28:0x0099, B:30:0x009f, B:34:0x00b2, B:36:0x00c3, B:38:0x00c9, B:39:0x00e2), top: B:14:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(wi0 wi0Var, Context context, View view, int i10) {
        wi0 wi0Var2;
        Context context2;
        File file;
        if (i10 == wi0Var.s) {
            wi0Var2 = wi0Var;
            context2 = context;
            org.telegram.ui.Components.bi biVar = new org.telegram.ui.Components.bi(context2, wi0Var2, false, false, true, wi0Var.f);
            wi0Var2.N = biVar;
            biVar.E1 = true;
            biVar.r3.setVisibility(8);
            biVar.d3.setText(org.telegram.messenger.dd.L0(2131752121, null));
            wi0Var2.N.d1();
            wi0Var2.N.show();
        } else {
            wi0Var2 = wi0Var;
            context2 = context;
        }
        if (view instanceof vi0) {
            vi0 vi0Var = (vi0) view;
            if (wi0Var2.simpleActionBar.s() || vi0Var.e == null) {
                wi0Var2.e0(vi0Var.e);
                return;
            }
            Ringtone ringtone = wi0Var2.O;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                ui0 ui0Var = vi0Var.e;
                if (ui0Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    wi0Var2.O = ringtone2;
                    ringtone2.play();
                } else {
                    String str = ui0Var.g;
                    if (str != null && !ui0Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(vi0Var.e.g));
                        ringtone3.setStreamType(4);
                        wi0Var2.O = ringtone3;
                        ringtone3.play();
                    } else if (ui0Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(vi0Var.e.g);
                            if (file.exists()) {
                                if (file == null) {
                                    org.telegram.messenger.b8 fileLoader = wi0Var2.getFileLoader();
                                    TLRPC.Document document = vi0Var.e.e;
                                    fileLoader.getClass();
                                    file = org.telegram.messenger.b8.I(document);
                                }
                                if (file == null && file.exists()) {
                                    Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                                    ringtone4.setStreamType(4);
                                    wi0Var2.O = ringtone4;
                                    ringtone4.play();
                                } else {
                                    org.telegram.messenger.b8 fileLoader2 = wi0Var2.getFileLoader();
                                    TLRPC.Document document2 = vi0Var.e.e;
                                    fileLoader2.X(document2, document2, 3, 0);
                                }
                            }
                        }
                        file = null;
                        if (file == null) {
                        }
                        if (file == null) {
                        }
                        org.telegram.messenger.b8 fileLoader22 = wi0Var2.getFileLoader();
                        TLRPC.Document document22 = vi0Var.e.e;
                        fileLoader22.X(document22, document22, 3, 0);
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            wi0Var2.M = null;
            wi0Var2.G = vi0Var.e;
            wi0Var2.H = true;
            kg.f fVar = wi0Var2.e;
            fVar.k(0, ((wi0) fVar.d).h);
        }
    }

    public static void b0(wi0 wi0Var) {
        wi0Var.I.clear();
        kg.f fVar = wi0Var.e;
        fVar.k(0, ((wi0) fVar.d).h);
        wi0Var.h0();
    }

    public static void f0(View view, int i10, int i11) {
        if (view instanceof org.telegram.ui.Cells.i2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            for (int i12 = 0; i12 < i2Var.getChildCount(); i12++) {
                View childAt = i2Var.getChildAt(i12);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.eq) {
                        org.telegram.ui.Components.eq eqVar = (org.telegram.ui.Components.eq) imageView.getDrawable();
                        Drawable drawable = eqVar.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = eqVar.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
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
        return (!TextUtils.isEmpty(str) || document == null) ? str : org.telegram.messenger.dd.a0("SoundNameEmpty", null, 2131745296, org.telegram.messenger.dd.u(document.date, true));
    }

    @Override // org.telegram.ui.Components.nj
    public final void B() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ti0(this, context));
        if (this.K == 0) {
            int i10 = this.L;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747884, null));
            } else if (i10 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747885, null));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747886, null));
            } else if (i10 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747882, null));
            } else if (i10 == 5 || i10 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747883, null));
            }
        } else {
            this.J = new org.telegram.ui.Components.sn(context, null, false, this.f);
            if (this.K >= 0) {
                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.K));
                if (Z1 != null) {
                    this.J.setUserAvatar(Z1);
                    this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                }
            } else if (this.P != 0) {
                TLRPC.TL_forumTopic f7 = getMessagesController().r7.f(-this.K, this.P);
                gg.e.p(this.J.getAvatarImageView(), f7, false, true, this.f);
                this.simpleActionBar.setTitle(f7.title);
            } else {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.K));
                this.J.setChatAvatar(L0);
                this.simpleActionBar.setTitle(L0.title);
            }
            this.simpleActionBar.setSubtitle(org.telegram.messenger.dd.L0(2131747887, null));
            org.telegram.messenger.i0.E2(this.J.e);
            this.simpleActionBar.addView(this.J.e, w7.b6.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.o5 l4 = this.simpleActionBar.l();
        l4.d(2, R.drawable.msg_forward, org.telegram.messenger.dd.L0(2131745477, null), org.telegram.messenger.i0.L(54.0f));
        l4.d(1, R.drawable.msg_delete, org.telegram.messenger.dd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.d = uk0Var;
        uk0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        kg.f fVar = new kg.f(this, 7);
        this.e = fVar;
        fVar.C(true);
        this.d.setAdapter(this.e);
        ((s4.j) this.d.getItemAnimator()).m = false;
        ((s4.j) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new s4.a0());
        this.d.setOnItemClickListener(new mg.q0(19, this, context));
        this.d.setOnItemLongClickListener(new st(this, 27));
        getMediaDataController().z0.g(false);
        this.a.clear();
        this.b.clear();
        for (int i11 = 0; i11 < getMediaDataController().z0.e.size(); i11++) {
            of.b bVar = (of.b) getMediaDataController().z0.e.get(i11);
            ui0 ui0Var = new ui0();
            int i12 = this.F;
            this.F = i12 + 1;
            ui0Var.c = i12;
            ui0Var.a = true;
            ui0Var.d = bVar.c;
            TLRPC.Document document3 = bVar.a;
            String str = document3.file_name_fixed;
            ui0Var.f = str;
            ui0Var.e = document3;
            ui0Var.f = g0(document3, str);
            ui0Var.g = bVar.b;
            ui0 ui0Var2 = this.M;
            if (ui0Var2 != null && (document = ui0Var2.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                this.M = null;
                this.G = ui0Var;
            }
            this.a.add(ui0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.w0.b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        ui0 ui0Var3 = new ui0();
        int i13 = this.F;
        this.F = i13 + 1;
        ui0Var3.c = i13;
        ui0Var3.f = org.telegram.messenger.dd.L0(2131748167, null);
        this.b.add(ui0Var3);
        ui0 ui0Var4 = new ui0();
        int i14 = this.F;
        this.F = i14 + 1;
        ui0Var4.c = i14;
        ui0Var4.f = org.telegram.messenger.dd.L0(2131751600, null);
        ui0Var4.b = true;
        this.b.add(ui0Var4);
        ui0 ui0Var5 = this.M;
        if (ui0Var5 != null && ui0Var5.e == null && ui0Var5.g.equals("NoSound")) {
            this.M = null;
            this.G = ui0Var3;
        }
        ui0 ui0Var6 = this.M;
        if (ui0Var6 != null && ui0Var6.e == null && ui0Var6.g.equals("Default")) {
            this.M = null;
            this.G = ui0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            ui0 ui0Var7 = new ui0();
            int i15 = this.F;
            this.F = i15 + 1;
            ui0Var7.c = i15;
            ui0Var7.f = string;
            ui0Var7.g = str2;
            ui0 ui0Var8 = this.M;
            if (ui0Var8 != null && ui0Var8.e == null && ui0Var8.g.equals(str2)) {
                this.M = null;
                this.G = ui0Var7;
            }
            this.b.add(ui0Var7);
        }
        if (getMediaDataController().z0.f && this.G == null) {
            this.G = ui0Var4;
            this.H = true;
        }
        i0();
        i0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i10 == org.telegram.messenger.at.e5) {
            HashMap hashMap = new HashMap();
            int i12 = 0;
            while (true) {
                arrayList = this.a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((ui0) arrayList.get(i12)).d), (ui0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().z0.e.size(); i13++) {
                of.b bVar = (of.b) getMediaDataController().z0.e.get(i13);
                ui0 ui0Var = new ui0();
                ui0 ui0Var2 = (ui0) hashMap.get(Integer.valueOf(bVar.c));
                if (ui0Var2 != null) {
                    if (ui0Var2 == this.G) {
                        this.G = ui0Var;
                    }
                    ui0Var.c = ui0Var2.c;
                } else {
                    int i14 = this.F;
                    this.F = i14 + 1;
                    ui0Var.c = i14;
                }
                ui0Var.a = true;
                ui0Var.d = bVar.c;
                TLRPC.Document document3 = bVar.a;
                if (document3 != null) {
                    ui0Var.f = document3.file_name_fixed;
                } else {
                    ui0Var.f = new File(bVar.b).getName();
                }
                TLRPC.Document document4 = bVar.a;
                ui0Var.e = document4;
                ui0Var.f = g0(document4, ui0Var.f);
                ui0Var.g = bVar.b;
                ui0 ui0Var3 = this.M;
                if (ui0Var3 != null && (document = ui0Var3.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                    this.M = null;
                    this.G = ui0Var;
                }
                arrayList.add(ui0Var);
            }
            i0();
            this.e.f();
            if (getMediaDataController().z0.f && this.G == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.M = null;
                    this.G = (ui0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(ui0 ui0Var) {
        int i10 = ui0Var.c;
        SparseArray sparseArray = this.I;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(ui0Var.c);
        } else if (!ui0Var.a) {
            return;
        } else {
            sparseArray.put(ui0Var.c, ui0Var);
        }
        h0();
        kg.f fVar = this.e;
        fVar.k(0, ((wi0) fVar.d).h);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f;
    }

    public final void h0() {
        SparseArray sparseArray = this.I;
        if (sparseArray.size() <= 0) {
            this.simpleActionBar.r();
        } else {
            this.simpleActionBar.y(sparseArray.size(), this.simpleActionBar.s());
            this.simpleActionBar.C();
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
            int i10 = this.h;
            this.n = i10;
            int size = arrayList.size() + i10;
            this.h = size;
            this.r = size;
        }
        int i11 = this.h;
        this.s = i11;
        this.h = i11 + 2;
        this.w = i11 + 1;
        ArrayList arrayList2 = this.b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.h;
            int i13 = i12 + 1;
            this.h = i13;
            this.y = i12;
            this.D = i13;
            int size2 = arrayList2.size() + i13;
            this.h = size2;
            this.E = size2;
        }
        int i14 = this.h;
        this.h = i14 + 1;
        this.x = i14;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.nj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().l2((String) arrayList.get(i11));
        }
        getNotificationCenter().k(org.telegram.messenger.at.e5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 != 21 || intent == null || this.N == null) {
            return;
        }
        Uri data = intent.getData();
        int i12 = org.telegram.messenger.at.e5;
        boolean z10 = true;
        boolean z11 = false;
        if (data != null) {
            String T0 = org.telegram.messenger.i0.T0(intent.getData());
            if (T0 != null) {
                if (T0.startsWith("content://")) {
                    T0 = MediaController.t(-1L, intent.getData(), "mp3");
                }
                if (this.N.g2.P(new File(T0))) {
                    getMediaDataController().l2(T0);
                    getNotificationCenter().k(i12, new Object[0]);
                    z11 = z10;
                }
            }
            z10 = false;
            z11 = z10;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            boolean z12 = false;
            for (int i13 = 0; i13 < clipData.getItemCount(); i13++) {
                Uri uri = clipData.getItemAt(i13).getUri();
                String uri2 = uri.toString();
                if (uri2.startsWith("content://")) {
                    uri2 = MediaController.t(-1L, uri, "mp3");
                }
                if (this.N.g2.P(new File(uri2))) {
                    getMediaDataController().l2(uri2);
                    getNotificationCenter().k(i12, new Object[0]);
                    z12 = true;
                }
            }
            z11 = z12;
        }
        if (z11) {
            this.N.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.K = getArguments().getLong("dialog_id", 0L);
            this.P = getArguments().getLong("topic_id", 0L);
            this.L = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, -1);
        }
        long j10 = this.K;
        if (j10 != 0) {
            String v = org.telegram.messenger.pt.v(j10, this.P, false);
            str2 = sc.e.h("sound_document_id_", v);
            str = sc.e.h("sound_path_", v);
        } else {
            int i10 = this.L;
            if (i10 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i10 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j11 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        ui0 ui0Var = new ui0();
        this.M = ui0Var;
        if (j11 != 0) {
            ui0Var.e = new TLRPC.TL_document();
            this.M.e.id = j11;
        } else {
            ui0Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
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
            str = "sound_" + org.telegram.messenger.pt.v(this.K, this.P, false);
            str2 = "sound_path_" + org.telegram.messenger.pt.v(this.K, this.P, false);
            str3 = "sound_document_id_" + org.telegram.messenger.pt.v(this.K, this.P, false);
            edit.putBoolean("sound_enabled_" + org.telegram.messenger.pt.v(this.K, this.P, false), true);
        } else {
            int i10 = this.L;
            if (i10 == 1) {
                str = "GlobalSound";
                str2 = "GlobalSoundPath";
                str3 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                str = "GroupSound";
                str2 = "GroupSoundPath";
                str3 = "GroupSoundDocId";
            } else if (i10 == 2) {
                str = "ChannelSound";
                str2 = "ChannelSoundPath";
                str3 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                str = "StoriesSound";
                str2 = "StoriesSoundPath";
                str3 = "StoriesSoundDocId";
            } else {
                if (i10 != 5 && i10 != 4) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSound";
                str2 = "ReactionSoundPath";
                str3 = "ReactionSoundDocId";
            }
        }
        ui0 ui0Var = this.G;
        if (ui0Var.a && (document = ui0Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.G.f);
            edit.putString(str2, "NoSound");
        } else if (ui0Var.g != null) {
            edit.putString(str, ui0Var.f);
            edit.putString(str2, this.G.g);
            edit.remove(str3);
        } else if (ui0Var.b) {
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
            getNotificationCenter().k(org.telegram.messenger.at.f0, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.at.e5);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.at.e5);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f;
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.N6, p6Var);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.k7, p6Var);
            if (this.d != null) {
                if (w02 == this.Q && w03 == this.R) {
                    return;
                }
                this.Q = w02;
                this.R = w03;
                for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                    f0(this.d.getChildAt(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.d.getCachedChildCount(); i11++) {
                    f0(this.d.P(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.d.getHiddenChildCount(); i12++) {
                    f0(this.d.V(i12), w02, w03);
                }
                for (int i13 = 0; i13 < this.d.getAttachedScrapChildCount(); i13++) {
                    f0(this.d.O(i13), w02, w03);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i10, long j10) {
    }
}
