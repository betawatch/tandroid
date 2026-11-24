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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class st8 extends d implements jm7 {
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
    public r59 b;
    public boolean b0;
    public qt8 c;
    public boolean c0;
    public AnimatorSet d;
    public final ylb e;
    public final long f;
    public final long h;
    public final boolean n;
    public boolean r;
    public rt8 s;
    public z82 w;
    public int x;
    public int y;

    public st8(Bundle bundle, ylb ylbVar) {
        super(bundle);
        this.e = ylbVar;
        this.f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.n = bundle.getBoolean("exception", false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.g7));
        hashSet.add(Integer.valueOf(cmb.f7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j = this.f;
        long j2 = this.h;
        String p = lo7.p(j, j2, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt8(this, p));
        ylb ylbVar = this.e;
        z82 z82Var = new z82(context, null, false, ylbVar);
        this.w = z82Var;
        z82Var.setOccupyStatusBar(!gm.O1());
        if (j >= 0) {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
            if (W1 != null) {
                this.w.setUserAvatar(W1);
                this.simpleActionBar.setTitle(bw2.m(0, W1.first_name, W1.last_name));
            }
        } else if (j2 != 0) {
            TLRPC.TL_forumTopic f = getMessagesController().g4.f(-j, j2);
            no4.q(this.w.getAvatarImageView(), f, false, true, ylbVar);
            this.simpleActionBar.setTitle(f.title);
        } else {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
            this.w.setChatAvatar(L0);
            this.simpleActionBar.setTitle(L0.title);
        }
        rja rjaVar = this.simpleActionBar;
        if (this.n) {
            rjaVar.setSubtitle(jb6.M0(2131747628, null));
            this.simpleActionBar.s(jb6.M0(2131745680, null));
        } else {
            rjaVar.setSubtitle(jb6.M0(2131751621, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setSectionsDrawBackground(true);
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        r59 r59Var2 = this.b;
        qt8 qt8Var = new qt8(this, context);
        this.c = qt8Var;
        r59Var2.setAdapter(qt8Var);
        this.b.setItemAnimator(null);
        this.b.setLayoutAnimation(null);
        this.b.setLayoutManager(new zs((byte) 14));
        this.b.setOnItemClickListener(new is((jm7) this, context, (Object) p, (byte) 3));
        this.a = frameLayout;
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.f0) {
            try {
                this.c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        return this.e;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 7);
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.b, 0, new Class[]{v8c.class}, new String[]{"statusColor"}, (Drawable[]) null, za2Var, cmb.x6));
        arrayList.add(new cnb(this.b, 0, new Class[]{v8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void m0(String str) {
        this.c0 = true;
        oc7.r1(this.currentAccount).W3.edit().putBoolean("custom_" + str, false).remove("notify2_" + str).apply();
        finishFragment();
        rt8 rt8Var = this.s;
        if (rt8Var != null) {
            rt8Var.v();
        }
    }

    public final void n0(int i, int i2, String str) {
        oc7.r1(this.currentAccount).W3.edit().putInt("smart_max_count_" + str, i).putInt("smart_delay_" + str, i2).apply();
        qt8 qt8Var = this.c;
        if (qt8Var != null) {
            qt8Var.g(this.J);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(Context context, String str, View view, int i) {
        int w0;
        int w02;
        int w03;
        int w04;
        int w05;
        if (view.isEnabled()) {
            int i2 = this.Y;
            ylb ylbVar = this.e;
            Parcelable parcelable = null;
            if (i == i2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                String M0 = jb6.M0(2131745835, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131745836, null);
                alertDialog$Builder.j(jb6.M0(2131745851, null), new nt8(this, str));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                    return;
                }
                return;
            }
            if (i == this.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f);
                bundle.putLong("topic_id", this.h);
                presentFragment(new ep7(bundle, ylbVar));
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
                    SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
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
                    fc4.g(e, true);
                    return;
                }
            }
            if (i == this.I) {
                Activity parentActivity = getParentActivity();
                final Object[] objArr = null == true ? 1 : 0;
                Runnable runnable = new Runnable(this) { // from class: ot8
                    public final /* synthetic */ st8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = objArr;
                        st8 st8Var = this.b;
                        switch (b2) {
                            case 0:
                                qt8 qt8Var = st8Var.c;
                                if (qt8Var != null) {
                                    qt8Var.g(st8Var.I);
                                    break;
                                }
                                break;
                            case 1:
                                qt8 qt8Var2 = st8Var.c;
                                if (qt8Var2 != null) {
                                    qt8Var2.g(st8Var.T);
                                    break;
                                }
                                break;
                            case 2:
                                qt8 qt8Var3 = st8Var.c;
                                if (qt8Var3 != null) {
                                    qt8Var3.g(st8Var.K);
                                    break;
                                }
                                break;
                            default:
                                qt8 qt8Var4 = st8Var.c;
                                if (qt8Var4 != null) {
                                    qt8Var4.g(st8Var.W);
                                    break;
                                }
                                break;
                        }
                    }
                };
                Pattern pattern = ik.a;
                long j = this.f;
                showDialog(ik.V(parentActivity, j, this.h, j != 0 ? kt6.n(j, "vibrate_") : "vibrate_messages", runnable, this.e));
                return;
            }
            final byte b2 = 3;
            final byte b3 = 2;
            if (i == this.F) {
                bjb bjbVar = (bjb) view;
                boolean z = !bjbVar.e.h;
                this.r = z;
                bjbVar.setChecked(z);
                int childCount = this.b.getChildCount();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < childCount; i3++) {
                    b59 b59Var = (b59) this.b.T(this.b.getChildAt(i3));
                    int i4 = b59Var.f;
                    View view2 = b59Var.a;
                    int b4 = b59Var.b();
                    if (b4 != this.F && b4 != this.Y) {
                        if (i4 == 0) {
                            ((jf5) view2).a(arrayList, this.r);
                        } else if (i4 == 1) {
                            ((vkb) view2).a(arrayList, this.r);
                        } else if (i4 == 2) {
                            ((njb) view2).c(arrayList, this.r);
                        } else if (i4 == 3) {
                            ((djb) view2).a(arrayList, this.r);
                        } else if (i4 == 4) {
                            ((w09) view2).b(arrayList, this.r);
                        } else if (i4 == 7 && b4 == this.G) {
                            ((bjb) view2).e(arrayList, this.r);
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
                this.d.addListener(new s38(this, (byte) 25));
                this.d.setDuration(150L);
                this.d.start();
                return;
            }
            if (i == this.G) {
                bjb bjbVar2 = (bjb) view;
                Switch r3 = bjbVar2.e;
                oc7.r1(this.currentAccount).W3.edit().putBoolean(b10.h("content_preview_", str), !r3.h).apply();
                bjbVar2.setChecked(!r3.h);
                return;
            }
            if (i == this.T) {
                showDialog(ik.V(getParentActivity(), this.f, this.h, b10.h("calls_vibrate_", str), new Runnable(this) { // from class: ot8
                    public final /* synthetic */ st8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b;
                        st8 st8Var = this.b;
                        switch (b22) {
                            case 0:
                                qt8 qt8Var = st8Var.c;
                                if (qt8Var != null) {
                                    qt8Var.g(st8Var.I);
                                    break;
                                }
                                break;
                            case 1:
                                qt8 qt8Var2 = st8Var.c;
                                if (qt8Var2 != null) {
                                    qt8Var2.g(st8Var.T);
                                    break;
                                }
                                break;
                            case 2:
                                qt8 qt8Var3 = st8Var.c;
                                if (qt8Var3 != null) {
                                    qt8Var3.g(st8Var.K);
                                    break;
                                }
                                break;
                            default:
                                qt8 qt8Var4 = st8Var.c;
                                if (qt8Var4 != null) {
                                    qt8Var4.g(st8Var.W);
                                    break;
                                }
                                break;
                        }
                    }
                }, this.e));
                return;
            }
            if (i == this.K) {
                showDialog(ik.F(getParentActivity(), this.f, this.h, -1, new Runnable(this) { // from class: ot8
                    public final /* synthetic */ st8 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b3;
                        st8 st8Var = this.b;
                        switch (b22) {
                            case 0:
                                qt8 qt8Var = st8Var.c;
                                if (qt8Var != null) {
                                    qt8Var.g(st8Var.I);
                                    break;
                                }
                                break;
                            case 1:
                                qt8 qt8Var2 = st8Var.c;
                                if (qt8Var2 != null) {
                                    qt8Var2.g(st8Var.T);
                                    break;
                                }
                                break;
                            case 2:
                                qt8 qt8Var3 = st8Var.c;
                                if (qt8Var3 != null) {
                                    qt8Var3.g(st8Var.K);
                                    break;
                                }
                                break;
                            default:
                                qt8 qt8Var4 = st8Var.c;
                                if (qt8Var4 != null) {
                                    qt8Var4.g(st8Var.W);
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
                        showDialog(ik.t(getParentActivity(), this.f, this.h, -1, new Runnable(this) { // from class: ot8
                            public final /* synthetic */ st8 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b22 = b2;
                                st8 st8Var = this.b;
                                switch (b22) {
                                    case 0:
                                        qt8 qt8Var = st8Var.c;
                                        if (qt8Var != null) {
                                            qt8Var.g(st8Var.I);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        qt8 qt8Var2 = st8Var.c;
                                        if (qt8Var2 != null) {
                                            qt8Var2.g(st8Var.T);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        qt8 qt8Var3 = st8Var.c;
                                        if (qt8Var3 != null) {
                                            qt8Var3.g(st8Var.K);
                                            break;
                                        }
                                        break;
                                    default:
                                        qt8 qt8Var4 = st8Var.c;
                                        if (qt8Var4 != null) {
                                            qt8Var4.g(st8Var.W);
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
                    oc7.r1(this.currentAccount).W3.edit().putInt("popup_" + str, 1).apply();
                    ((w09) view).a(true, true);
                    View findViewWithTag = this.b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((w09) findViewWithTag).a(false, true);
                        return;
                    }
                    return;
                }
                if (i == this.O) {
                    oc7.r1(this.currentAccount).W3.edit().putInt("popup_" + str, 2).apply();
                    ((w09) view).a(true, true);
                    View findViewWithTag2 = this.b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((w09) findViewWithTag2).a(false, true);
                        return;
                    }
                    return;
                }
                if (i == this.Q) {
                    bjb bjbVar3 = (bjb) view;
                    boolean z2 = bjbVar3.e.h;
                    boolean z3 = !z2;
                    bjbVar3.setChecked(z3);
                    SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
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
                SharedPreferences sharedPreferences2 = oc7.r1(this.currentAccount).W3;
                int g = kt6.g("smart_max_count_", str, sharedPreferences2, 2);
                int g2 = kt6.g("smart_delay_", str, sharedPreferences2, nm7.J2);
                if (g == 0) {
                    g = 2;
                }
                Activity parentActivity2 = getParentActivity();
                nt8 nt8Var = new nt8(this, str);
                Pattern pattern2 = ik.a;
                if (parentActivity2 != null) {
                    int i5 = cmb.i5;
                    if (ylbVar != null) {
                        w0 = ylbVar.f(i5);
                        w02 = ylbVar.f(cmb.g5);
                        ylbVar.f(cmb.zj);
                        ylbVar.f(cmb.Dj);
                        ylbVar.f(cmb.D8);
                        ylbVar.f(cmb.F8);
                        ylbVar.f(cmb.h6);
                        w03 = ylbVar.f(cmb.Ii);
                        w04 = ylbVar.f(cmb.Ei);
                        w05 = ylbVar.f(cmb.Gi);
                    } else {
                        w0 = cmb.w0(null, i5, false);
                        w02 = cmb.w0(null, cmb.g5, false);
                        cmb.w0(null, cmb.zj, false);
                        cmb.w0(null, cmb.Dj, false);
                        cmb.w0(null, cmb.D8, false);
                        cmb.w0(null, cmb.F8, false);
                        cmb.w0(null, cmb.h6, false);
                        w03 = cmb.w0(null, cmb.Ii, false);
                        w04 = cmb.w0(null, cmb.Ei, false);
                        w05 = cmb.w0(null, cmb.Gi, false);
                    }
                    int i6 = w04;
                    int i7 = w05;
                    k6d k6dVar = new k6d(parentActivity2, ylbVar);
                    Object obj = k6dVar.b;
                    ((my0) obj).w0 = false;
                    int i8 = w03;
                    sj sjVar = new sj(parentActivity2, ylbVar);
                    sjVar.setMinValue(0);
                    sjVar.setMaxValue(10);
                    sjVar.setTextColor(w0);
                    sjVar.setValue(g - 1);
                    sjVar.setWrapSelectorWheel(false);
                    sjVar.setFormatter(new zg((byte) 1));
                    tj tjVar = new tj(parentActivity2, ylbVar);
                    tjVar.setMinValue(0);
                    tjVar.setMaxValue(10);
                    tjVar.setTextColor(w0);
                    tjVar.setValue((g2 / 60) - 1);
                    tjVar.setWrapSelectorWheel(false);
                    tjVar.setFormatter(new zg((byte) 2));
                    lp7 lp7Var = new lp7(parentActivity2, ylbVar);
                    lp7Var.setMinValue(0);
                    lp7Var.setMaxValue(0);
                    lp7Var.setTextColor(w0);
                    lp7Var.setValue(0);
                    lp7Var.setWrapSelectorWheel(false);
                    lp7Var.setFormatter(new zg((byte) 3));
                    zi ziVar = new zi(parentActivity2, sjVar, tjVar, lp7Var, (byte) 5);
                    ziVar.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(parentActivity2);
                    ziVar.addView(frameLayout, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(parentActivity2);
                    textView2.setText(jb6.M0(2131747854, null));
                    textView2.setTextColor(w0);
                    ts2.s(textView2, 1, 20.0f);
                    frameLayout.addView(textView2, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new p8((byte) 6));
                    LinearLayout linearLayout = new LinearLayout(parentActivity2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    ziVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                    wb wbVar = new wb(parentActivity2, (byte) 5);
                    linearLayout.addView(sjVar, qoe.l(0.4f, 0, nm7.s4));
                    linearLayout.addView(lp7Var, qoe.p(0, -2, 0.2f, 16));
                    linearLayout.addView(tjVar, qoe.l(0.4f, 0, nm7.s4));
                    wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                    wbVar.setGravity(17);
                    wbVar.setTextColor(i8);
                    wbVar.setTextSize(1, 14.0f);
                    wbVar.setTypeface(gm.o());
                    int L = gm.L(8.0f);
                    wbVar.setBackgroundDrawable(cmb.i0(L, L, L, L, i6, i7, i7));
                    wbVar.setText(jb6.M0(2131753831, null));
                    ziVar.addView(wbVar, qoe.t(-1, 48, 83, 16, 15, 16, 16));
                    c cVar = new c((byte) 17);
                    sjVar.setOnValueChangedListener(cVar);
                    tjVar.setOnValueChangedListener(cVar);
                    wbVar.setOnClickListener(new ef((Object) sjVar, (Object) tjVar, (Object) nt8Var, (Object) k6dVar, (byte) 1));
                    my0 my0Var = (my0) obj;
                    my0Var.O = ziVar;
                    my0Var.show();
                    my0Var.s0(w02);
                    my0Var.K(w02);
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
            str = i == 13 ? uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? jb6.M0(2131751536, null) : ringtone.getTitle(getParentActivity()) : uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? jb6.M0(2131745014, null) : ringtone.getTitle(getParentActivity());
            ringtone.stop();
        }
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
        String p = lo7.p(this.f, this.h, false);
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
        qt8 qt8Var = this.c;
        if (qt8Var != null) {
            qt8Var.g(i == 13 ? this.S : this.H);
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
        if (pg3.D(j)) {
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
        if (pg3.B(j)) {
            this.G = -1;
        } else {
            int i4 = this.a0;
            this.a0 = i4 + 1;
            this.G = i4;
            if (pg3.D(j)) {
                int i5 = this.a0;
                this.a0 = i5 + 1;
                this.Q = i5;
            }
        }
        int i6 = this.a0;
        this.H = i6;
        this.a0 = i6 + 2;
        this.I = i6 + 1;
        if (pg3.y(j)) {
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
        if (pg3.y(j)) {
            TLRPC.Chat L0 = oc7.r1(this.currentAccount).L0(Long.valueOf(-j));
            if (sd2.T(L0) && !L0.megagroup) {
                z = true;
                if (!pg3.B(j) || z) {
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
                if (pg3.D(j)) {
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
                boolean x = lo7.n(this.currentAccount).x(this.f, null, false, false);
                if (z2) {
                    SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
                    String p = lo7.p(j, j2, false);
                    boolean contains = sharedPreferences.contains("notify2_" + p);
                    int g = kt6.g("notify2_", p, sharedPreferences, 0);
                    if (g == 0) {
                        if (contains) {
                            this.r = true;
                        } else {
                            this.r = lo7.n(this.currentAccount).x(this.f, null, false, false);
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
                nm7.f(this.currentAccount).b(this, nm7.f0);
                return super.onFragmentCreate();
            }
        }
        z = false;
        if (pg3.B(j)) {
        }
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        if (pg3.D(j)) {
        }
        int i112 = this.a0;
        this.V = i112;
        this.W = i112 + 1;
        int i122 = i112 + 3;
        this.a0 = i122;
        this.X = i112 + 2;
        if (z2) {
        }
        boolean x2 = lo7.n(this.currentAccount).x(this.f, null, false, false);
        if (z2) {
        }
        nm7.f(this.currentAccount).b(this, nm7.f0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.c0) {
            String p = lo7.p(this.f, this.h, false);
            oc7.r1(this.currentAccount).W3.edit().putBoolean("custom_" + p, true).apply();
        }
        nm7.f(this.currentAccount).n(this, nm7.f0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        gm.v3(this.w.e, 0, ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gm.L(42.0f)) / 2) + this.mSystemInsets.b, gm.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gm.B2(this.w.e);
        if (!this.n) {
            this.a.addView(this.w.e, qoe.e(42, 42, 53));
        }
        gm.v3(this.w.e, 0, ((org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() - gm.L(42.0f)) / 2) + this.mSystemInsets.b, gm.L(6.0f), 0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
