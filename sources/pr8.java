// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pr8 extends d implements gk7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public FrameLayout a;
    public int a0;
    public o39 b;
    public boolean b0;
    public nr8 c;
    public boolean c0;
    public AnimatorSet d;
    public final wjb e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public or8 s;
    public o72 w;
    public int x;
    public int y;

    public pr8(Bundle bundle, wjb wjbVar) {
        super(bundle);
        this.e = wjbVar;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.g7));
        hashSet.add(Integer.valueOf(bkb.f7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j = this.f;
        long j2 = this.h;
        String p = im7.p(j, j2, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new mr8(this, p));
        wjb wjbVar = this.e;
        o72 o72Var = new o72(context, null, false, wjbVar);
        this.w = o72Var;
        o72Var.setOccupyStatusBar(!gl.O1());
        if (j >= 0) {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
            if (V1 != null) {
                this.w.setUserAvatar(V1);
                this.simpleActionBar.setTitle(qu2.m(0, V1.first_name, V1.last_name));
            }
        } else if (j2 != 0) {
            TLRPC.TL_forumTopic f = getMessagesController().g4.f(-j, j2);
            mm4.q(this.w.getAvatarImageView(), f, false, true, wjbVar);
            this.simpleActionBar.setTitle(f.title);
        } else {
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
            this.w.setChatAvatar(K0);
            this.simpleActionBar.setTitle(K0.title);
        }
        pha phaVar = this.simpleActionBar;
        if (this.n) {
            phaVar.setSubtitle(k96.M0(2131747702, null));
            this.simpleActionBar.s(k96.M0(2131745754, null));
        } else {
            phaVar.setSubtitle(k96.M0(2131751672, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        o39 o39Var2 = this.b;
        nr8 nr8Var = new nr8(this, context);
        this.c = nr8Var;
        o39Var2.setAdapter(nr8Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new zr((byte) 14));
        this.b.setOnItemClickListener(new ir((gk7) this, context, (Object) p, (byte) 3));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.e0) {
            try {
                this.c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final wjb getResourceProvider() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 7);
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        arrayList.add(new blb(this.b, 0, new Class[]{u6c.class}, new String[]{"statusColor"}, (Drawable[]) null, o92Var, bkb.x6));
        arrayList.add(new blb(this.b, 0, new Class[]{u6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void l0(String str) {
        this.c0 = true;
        na7.q1(this.currentAccount).W3.edit().putBoolean("custom_" + str, false).remove("notify2_" + str).apply();
        finishFragment();
        or8 or8Var = this.s;
        if (or8Var != null) {
            or8Var.n();
        }
    }

    public final void m0(int i, int i2, String str) {
        na7.q1(this.currentAccount).W3.edit().putInt("smart_max_count_" + str, i).putInt("smart_delay_" + str, i2).apply();
        nr8 nr8Var = this.c;
        if (nr8Var != null) {
            nr8Var.g(this.J);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(Context context, String str, View view, int i) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (view.isEnabled()) {
            int i2 = this.Y;
            wjb wjbVar = this.e;
            Parcelable parcelable = null;
            if (i == i2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                String M0 = k96.M0(2131745909, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131745910, null);
                alertDialog$Builder.j(k96.M0(2131745925, null), new kr8(this, str));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                    return;
                }
                return;
            }
            if (i == this.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f);
                bundle.putLong("topic_id", this.h);
                presentFragment(new an7(bundle, wjbVar));
                return;
            }
            final byte b = 1;
            if (i == this.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = na7.q1(this.currentAccount).W3;
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    String path = uri != null ? uri.getPath() : null;
                    String string = sharedPreferences.getString("ringtone_path_" + str, path);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(path) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    startActivityForResult(intent, 13);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
            if (i == this.I) {
                Activity parentActivity = getParentActivity();
                final Object[] objArr = null == true ? 1 : 0;
                Runnable runnable = new Runnable(this) { // from class: lr8
                    public final /* synthetic */ pr8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = objArr;
                        pr8 pr8Var = this.b;
                        switch (b2) {
                            case 0:
                                nr8 nr8Var = pr8Var.c;
                                if (nr8Var != null) {
                                    nr8Var.g(pr8Var.I);
                                    break;
                                }
                                break;
                            case 1:
                                nr8 nr8Var2 = pr8Var.c;
                                if (nr8Var2 != null) {
                                    nr8Var2.g(pr8Var.T);
                                    break;
                                }
                                break;
                            case 2:
                                nr8 nr8Var3 = pr8Var.c;
                                if (nr8Var3 != null) {
                                    nr8Var3.g(pr8Var.K);
                                    break;
                                }
                                break;
                            default:
                                nr8 nr8Var4 = pr8Var.c;
                                if (nr8Var4 != null) {
                                    nr8Var4.g(pr8Var.W);
                                    break;
                                }
                                break;
                        }
                    }
                };
                Pattern pattern = ij.a;
                long j = this.f;
                showDialog(ij.V(parentActivity, j, this.h, j != 0 ? ls6.n(j, "vibrate_") : "vibrate_messages", runnable, this.e));
                return;
            }
            final byte b2 = 3;
            final byte b3 = 2;
            if (i == this.F) {
                ahb ahbVar = (ahb) view;
                boolean z = !ahbVar.e.h;
                this.r = z;
                ahbVar.setChecked(z);
                int childCount = this.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < childCount; i3++) {
                    y29 y29Var = (y29) this.b.T(this.b.getChildAt(i3));
                    int i4 = y29Var.f;
                    View view2 = y29Var.a;
                    int b4 = y29Var.b();
                    if (b4 != this.F && b4 != this.Y) {
                        if (i4 == 0) {
                            ((ld5) view2).a(arrayList, this.r);
                        } else if (i4 == 1) {
                            ((uib) view2).a(arrayList, this.r);
                        } else if (i4 == 2) {
                            ((mhb) view2).c(arrayList, this.r);
                        } else if (i4 == 3) {
                            ((chb) view2).a(arrayList, this.r);
                        } else if (i4 == 4) {
                            ((vy8) view2).b(arrayList, this.r);
                        } else if (i4 == 7 && b4 == this.G) {
                            ((ahb) view2).e(arrayList, this.r);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AnimatorSet animatorSet = this.d;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.d = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.d.addListener(new l48(this, (byte) 23));
                this.d.setDuration(150L);
                this.d.start();
                return;
            }
            if (i == this.G) {
                ahb ahbVar2 = (ahb) view;
                Switch r3 = ahbVar2.e;
                na7.q1(this.currentAccount).W3.edit().putBoolean(b00.h("content_preview_", str), !r3.h).apply();
                ahbVar2.setChecked(!r3.h);
                return;
            }
            if (i == this.T) {
                showDialog(ij.V(getParentActivity(), this.f, this.h, b00.h("calls_vibrate_", str), new Runnable(this) { // from class: lr8
                    public final /* synthetic */ pr8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b;
                        pr8 pr8Var = this.b;
                        switch (b22) {
                            case 0:
                                nr8 nr8Var = pr8Var.c;
                                if (nr8Var != null) {
                                    nr8Var.g(pr8Var.I);
                                    break;
                                }
                                break;
                            case 1:
                                nr8 nr8Var2 = pr8Var.c;
                                if (nr8Var2 != null) {
                                    nr8Var2.g(pr8Var.T);
                                    break;
                                }
                                break;
                            case 2:
                                nr8 nr8Var3 = pr8Var.c;
                                if (nr8Var3 != null) {
                                    nr8Var3.g(pr8Var.K);
                                    break;
                                }
                                break;
                            default:
                                nr8 nr8Var4 = pr8Var.c;
                                if (nr8Var4 != null) {
                                    nr8Var4.g(pr8Var.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, this.e));
                return;
            }
            if (i == this.K) {
                showDialog(ij.F(getParentActivity(), this.f, this.h, -1, new Runnable(this) { // from class: lr8
                    public final /* synthetic */ pr8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b3;
                        pr8 pr8Var = this.b;
                        switch (b22) {
                            case 0:
                                nr8 nr8Var = pr8Var.c;
                                if (nr8Var != null) {
                                    nr8Var.g(pr8Var.I);
                                    break;
                                }
                                break;
                            case 1:
                                nr8 nr8Var2 = pr8Var.c;
                                if (nr8Var2 != null) {
                                    nr8Var2.g(pr8Var.T);
                                    break;
                                }
                                break;
                            case 2:
                                nr8 nr8Var3 = pr8Var.c;
                                if (nr8Var3 != null) {
                                    nr8Var3.g(pr8Var.K);
                                    break;
                                }
                                break;
                            default:
                                nr8 nr8Var4 = pr8Var.c;
                                if (nr8Var4 != null) {
                                    nr8Var4.g(pr8Var.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, this.e));
                return;
            }
            if (i != this.J) {
                if (i == this.W) {
                    if (getParentActivity() != null) {
                        showDialog(ij.t(getParentActivity(), this.f, this.h, -1, new Runnable(this) { // from class: lr8
                            public final /* synthetic */ pr8 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b22 = b2;
                                pr8 pr8Var = this.b;
                                switch (b22) {
                                    case 0:
                                        nr8 nr8Var = pr8Var.c;
                                        if (nr8Var != null) {
                                            nr8Var.g(pr8Var.I);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        nr8 nr8Var2 = pr8Var.c;
                                        if (nr8Var2 != null) {
                                            nr8Var2.g(pr8Var.T);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        nr8 nr8Var3 = pr8Var.c;
                                        if (nr8Var3 != null) {
                                            nr8Var3.g(pr8Var.K);
                                            break;
                                        }
                                        break;
                                    default:
                                        nr8 nr8Var4 = pr8Var.c;
                                        if (nr8Var4 != null) {
                                            nr8Var4.g(pr8Var.W);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, this.e));
                        return;
                    }
                    return;
                }
                if (i == this.N) {
                    na7.q1(this.currentAccount).W3.edit().putInt("popup_" + str, 1).apply();
                    ((vy8) view).a(true, true);
                    View findViewWithTag = this.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((vy8) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i == this.O) {
                    na7.q1(this.currentAccount).W3.edit().putInt("popup_" + str, 2).apply();
                    ((vy8) view).a(true, true);
                    View findViewWithTag2 = this.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((vy8) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i == this.Q) {
                    ahb ahbVar3 = (ahb) view;
                    boolean z2 = ahbVar3.e.h;
                    boolean z3 = !z2;
                    ahbVar3.setChecked(z3);
                    SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
                    if (!this.b0 || z2) {
                        edit.putBoolean("stories_" + str, z3);
                    } else {
                        edit.remove("stories_" + str);
                    }
                    edit.apply();
                    getNotificationsController().c0(this.f, this.h, true);
                    return;
                }
                return;
            }
            if (getParentActivity() != null) {
                SharedPreferences sharedPreferences2 = na7.q1(this.currentAccount).W3;
                int g = ls6.g("smart_max_count_", str, sharedPreferences2, 2);
                int g2 = ls6.g("smart_delay_", str, sharedPreferences2, kk7.J2);
                if (g == 0) {
                    g = 2;
                }
                Activity parentActivity2 = getParentActivity();
                kr8 kr8Var = new kr8(this, str);
                Pattern pattern2 = ij.a;
                if (parentActivity2 != null) {
                    int i5 = bkb.i5;
                    if (wjbVar != null) {
                        w0 = wjbVar.f(i5);
                        w02 = wjbVar.f(bkb.g5);
                        wjbVar.f(bkb.zj);
                        wjbVar.f(bkb.Dj);
                        wjbVar.f(bkb.D8);
                        wjbVar.f(bkb.F8);
                        wjbVar.f(bkb.h6);
                        w03 = wjbVar.f(bkb.Ii);
                        w04 = wjbVar.f(bkb.Ei);
                        w05 = wjbVar.f(bkb.Gi);
                    } else {
                        w0 = bkb.w0(null, i5, false);
                        w02 = bkb.w0(null, bkb.g5, false);
                        bkb.w0(null, bkb.zj, false);
                        bkb.w0(null, bkb.Dj, false);
                        bkb.w0(null, bkb.D8, false);
                        bkb.w0(null, bkb.F8, false);
                        bkb.w0(null, bkb.h6, false);
                        w03 = bkb.w0(null, bkb.Ii, false);
                        w04 = bkb.w0(null, bkb.Ei, false);
                        w05 = bkb.w0(null, bkb.Gi, false);
                    }
                    int i6 = w04;
                    int i7 = w05;
                    i4d i4dVar = new i4d(parentActivity2, wjbVar);
                    Object obj = i4dVar.a;
                    ((fx0) obj).w0 = false;
                    int i8 = w03;
                    si siVar = new si(parentActivity2, wjbVar);
                    siVar.setMinValue(0);
                    siVar.setMaxValue(10);
                    siVar.setTextColor(w0);
                    siVar.setValue(g - 1);
                    siVar.setWrapSelectorWheel(false);
                    siVar.setFormatter(new ag((byte) 1));
                    ti tiVar = new ti(parentActivity2, wjbVar);
                    tiVar.setMinValue(0);
                    tiVar.setMaxValue(10);
                    tiVar.setTextColor(w0);
                    tiVar.setValue((g2 / 60) - 1);
                    tiVar.setWrapSelectorWheel(false);
                    tiVar.setFormatter(new ag((byte) 2));
                    hn7 hn7Var = new hn7(parentActivity2, wjbVar);
                    hn7Var.setMinValue(0);
                    hn7Var.setMaxValue(0);
                    hn7Var.setTextColor(w0);
                    hn7Var.setValue(0);
                    hn7Var.setWrapSelectorWheel(false);
                    hn7Var.setFormatter(new ag((byte) 3));
                    zh zhVar = new zh(parentActivity2, siVar, tiVar, hn7Var, (byte) 5);
                    zhVar.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(parentActivity2);
                    zhVar.addView(frameLayout, nme.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(parentActivity2);
                    textView2.setText(k96.M0(2131747928, null));
                    textView2.setTextColor(w0);
                    ir2.t(textView2, 1, 20.0f);
                    frameLayout.addView(textView2, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new p8((byte) 6));
                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    zhVar.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                    wb wbVar = new wb(parentActivity2, (byte) 5);
                    linearLayout.addView(siVar, nme.l(0.4f, 0, kk7.s4));
                    linearLayout.addView(hn7Var, nme.p(0, -2, 0.2f, 16));
                    linearLayout.addView(tiVar, nme.l(0.4f, 0, kk7.s4));
                    wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                    wbVar.setGravity(17);
                    wbVar.setTextColor(i8);
                    wbVar.setTextSize(1, 14.0f);
                    wbVar.setTypeface(gl.o());
                    int L = gl.L(8.0f);
                    wbVar.setBackgroundDrawable(bkb.i0(L, L, L, L, i6, i7, i7));
                    wbVar.setText(k96.M0(2131753863, null));
                    zhVar.addView(wbVar, nme.t(-1, 48, 83, 16, 15, 16, 16));
                    c cVar = new c((byte) 17);
                    siVar.setOnValueChangedListener(cVar);
                    tiVar.setOnValueChangedListener(cVar);
                    wbVar.setOnClickListener(new ee((Object) siVar, (Object) tiVar, (Object) kr8Var, (Object) i4dVar, (byte) 1));
                    fx0 fx0Var = (fx0) obj;
                    fx0Var.O = zhVar;
                    fx0Var.show();
                    fx0Var.s0(w02);
                    fx0Var.L(w02);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        Ringtone ringtone;
        if (i2 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        String str = null;
        if (uri != null && (ringtone = RingtoneManager.getRingtone(a.b, uri)) != null) {
            str = i == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? k96.M0(2131751587, null) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? k96.M0(2131745088, null) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
        String p = im7.p(this.f, this.h, false);
        if (i == 12) {
            if (str != null) {
                edit.putString("sound_" + p, str);
                edit.putString("sound_path_" + p, uri.toString());
            } else {
                edit.putString("sound_" + p, "NoSound");
                edit.putString("sound_path_" + p, "NoSound");
            }
            getNotificationsController().f(this.f, this.h);
        } else if (i == 13) {
            if (str != null) {
                edit.putString("ringtone_" + p, str);
                edit.putString("ringtone_path_" + p, uri.toString());
            } else {
                edit.putString("ringtone_" + p, "NoSound");
                edit.putString("ringtone_path_" + p, "NoSound");
            }
        }
        edit.apply();
        nr8 nr8Var = this.c;
        if (nr8Var != null) {
            nr8Var.g(i == 13 ? this.S : this.H);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        int i;
        boolean z;
        long j = this.f;
        if (cf3.D(j)) {
            ArrayList arrayList = getMediaDataController().j1;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                TLRPC.Peer peer = ((TLRPC.TL_topPeer) arrayList.get(i2)).peer;
                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == j) {
                    this.b0 = i2 < 5;
                } else {
                    i2++;
                }
            }
        }
        this.a0 = 0;
        boolean z2 = this.n;
        if (z2) {
            this.y = 0;
            this.a0 = 2;
            this.E = 1;
            i = 2;
        } else {
            this.y = -1;
            this.E = -1;
            i = 0;
        }
        int i3 = i + 1;
        this.a0 = i3;
        this.x = i;
        long j2 = this.h;
        if (z2 || j2 != 0) {
            this.a0 = i + 2;
            this.F = i3;
        } else {
            this.F = -1;
        }
        this.Q = -1;
        if (cf3.B(j)) {
            this.G = -1;
        } else {
            int i4 = this.a0;
            this.a0 = i4 + 1;
            this.G = i4;
            if (cf3.D(j)) {
                int i5 = this.a0;
                this.a0 = i5 + 1;
                this.Q = i5;
            }
        }
        int i6 = this.a0;
        this.H = i6;
        this.a0 = i6 + 2;
        this.I = i6 + 1;
        if (cf3.y(j)) {
            int i7 = this.a0;
            this.a0 = i7 + 1;
            this.J = i7;
        } else {
            this.J = -1;
        }
        int i8 = this.a0;
        this.K = i8;
        this.a0 = i8 + 2;
        this.L = i8 + 1;
        if (cf3.y(j)) {
            TLRPC.Chat K0 = na7.q1(this.currentAccount).K0(Long.valueOf(-j));
            if (hc2.T(K0) && !K0.megagroup) {
                z = true;
                if (!cf3.B(j) || z) {
                    this.M = -1;
                    this.N = -1;
                    this.O = -1;
                    this.P = -1;
                } else {
                    int i9 = this.a0;
                    this.M = i9;
                    this.N = i9 + 1;
                    this.O = i9 + 2;
                    this.a0 = i9 + 4;
                    this.P = i9 + 3;
                }
                if (cf3.D(j)) {
                    this.R = -1;
                    this.T = -1;
                    this.S = -1;
                    this.U = -1;
                } else {
                    int i10 = this.a0;
                    this.R = i10;
                    this.T = i10 + 1;
                    this.S = i10 + 2;
                    this.a0 = i10 + 4;
                    this.U = i10 + 3;
                }
                int i11 = this.a0;
                this.V = i11;
                this.W = i11 + 1;
                int i12 = i11 + 3;
                this.a0 = i12;
                this.X = i11 + 2;
                if (z2) {
                    this.Y = i12;
                    this.a0 = i11 + 5;
                    this.Z = i11 + 4;
                } else {
                    this.Y = -1;
                    this.Z = -1;
                }
                boolean x = im7.n(this.currentAccount).x(this.f, null, false, false);
                if (z2) {
                    SharedPreferences sharedPreferences = na7.q1(this.currentAccount).W3;
                    String p = im7.p(j, j2, false);
                    boolean contains = sharedPreferences.contains("notify2_" + p);
                    int g = ls6.g("notify2_", p, sharedPreferences, 0);
                    if (g == 0) {
                        if (contains) {
                            this.r = true;
                        } else {
                            this.r = im7.n(this.currentAccount).x(this.f, null, false, false);
                        }
                    } else if (g == 1) {
                        this.r = true;
                    } else if (g == 2) {
                        this.r = false;
                    } else {
                        this.r = false;
                    }
                } else {
                    this.r = !x;
                }
                kk7.f(this.currentAccount).b(this, kk7.e0);
                return super.onFragmentCreate();
            }
        }
        z = false;
        if (cf3.B(j)) {
        }
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        if (cf3.D(j)) {
        }
        int i112 = this.a0;
        this.V = i112;
        this.W = i112 + 1;
        int i122 = i112 + 3;
        this.a0 = i122;
        this.X = i112 + 2;
        if (z2) {
        }
        boolean x2 = im7.n(this.currentAccount).x(this.f, null, false, false);
        if (z2) {
        }
        kk7.f(this.currentAccount).b(this, kk7.e0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.c0) {
            String p = im7.p(this.f, this.h, false);
            na7.q1(this.currentAccount).W3.edit().putBoolean("custom_" + p, true).apply();
        }
        kk7.f(this.currentAccount).n(this, kk7.e0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        gl.w3(this.w.e, 0, ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gl.L(42.0f)) / 2) + this.mSystemInsets.b, gl.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gl.B2(this.w.e);
        if (!this.n) {
            this.a.addView(this.w.e, nme.e(42, 42, 53));
        }
        gl.w3(this.w.e, 0, ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gl.L(42.0f)) / 2) + this.mSystemInsets.b, gl.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
