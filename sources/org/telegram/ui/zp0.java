package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zp0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public boolean B;
    public String C;
    public int D;
    public boolean E;
    public final MediaController.AlbumEntry F;
    public org.telegram.ui.Components.wk0 G;
    public xp0 H;
    public tp0 I;
    public org.telegram.ui.Components.gw0 J;
    public eh.o K;
    public org.telegram.ui.ActionBar.w0 L;
    public org.telegram.ui.ActionBar.g1 M;
    public int N;
    public boolean O;
    public final int P;
    public final qn Q;
    public org.telegram.ui.Components.yk0 R;
    public int S;
    public boolean T;
    public boolean U;
    public FrameLayout V;
    public m0 W;
    public yi0 X;
    public View Y;
    public org.telegram.ui.Components.ut Z;
    public final int a;
    public ImageView a0;
    public final HashMap b;
    public sp0 b0;
    public final ArrayList c;
    public int c0;
    public CharSequence d;
    public final TextPaint d0;
    public boolean e;
    public final RectF e0;
    public final ArrayList f;
    public final Paint f0;
    public AnimatorSet g0;
    public final HashMap h;
    public boolean h0;
    public org.telegram.ui.ActionBar.o1 i0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout j0;
    public org.telegram.ui.ActionBar.g1[] k0;
    public String l0;
    public boolean m0;
    public final ArrayList n;
    public final boolean n0;
    public yp0 o0;
    public dq0 p0;
    public final int q0;
    public boolean r;
    public final int r0;
    public boolean s;
    public final int s0;
    public final pp0 t0;
    public String v;
    public String w;
    public int x;
    public int y;

    public zp0(int i9, MediaController.AlbumEntry albumEntry, HashMap hashMap, ArrayList arrayList, int i10, boolean z10, qn qnVar, boolean z11) {
        super(null);
        this.f = new ArrayList();
        this.h = new HashMap();
        new HashMap();
        this.n = new ArrayList();
        this.s = true;
        this.E = true;
        this.N = 100;
        this.c0 = 3;
        this.d0 = new TextPaint(1);
        this.e0 = new RectF();
        this.f0 = new Paint(1);
        this.m0 = true;
        this.t0 = new pp0(this);
        this.F = albumEntry;
        this.b = hashMap;
        this.c = arrayList;
        this.a = i9;
        this.P = i10;
        this.Q = qnVar;
        this.A = z10;
        this.n0 = z11;
        if (albumEntry == null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
            int i11 = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
            for (int i12 = 0; i12 < i11; i12++) {
                String string = sharedPreferences.getString("recent" + i12, null);
                if (string == null) {
                    break;
                }
                this.n.add(string);
            }
        }
        if (z11) {
            this.q0 = org.telegram.ui.ActionBar.f6.ug;
            this.r0 = org.telegram.ui.ActionBar.f6.hg;
            this.s0 = org.telegram.ui.ActionBar.f6.ig;
        } else {
            this.q0 = org.telegram.ui.ActionBar.f6.h5;
            this.r0 = org.telegram.ui.ActionBar.f6.j5;
            this.s0 = org.telegram.ui.ActionBar.f6.I5;
        }
    }

    public static /* synthetic */ void T(zp0 zp0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(zp0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(zp0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(zp0Var.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = zp0Var.C;
        zp0Var.C = null;
        zp0Var.c0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.t5 U(zp0 zp0Var, int i9) {
        int childCount = zp0Var.G.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zp0Var.G.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry == null ? !(intValue < 0 || intValue >= zp0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i9) {
                        return t5Var;
                    }
                }
            }
        }
        return null;
    }

    public final int X(int i9, Object obj) {
        boolean z10 = obj instanceof MediaController.PhotoEntry;
        Object valueOf = z10 ? Integer.valueOf(((MediaController.PhotoEntry) obj).imageId) : obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).id : null;
        if (valueOf == null) {
            return -1;
        }
        HashMap hashMap = this.b;
        boolean containsKey = hashMap.containsKey(valueOf);
        ArrayList arrayList = this.c;
        if (!containsKey) {
            hashMap.put(valueOf, obj);
            arrayList.add(valueOf);
            return -1;
        }
        hashMap.remove(valueOf);
        int indexOf = arrayList.indexOf(valueOf);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        if (this.e) {
            g0();
        }
        if (i9 >= 0) {
            if (z10) {
                ((MediaController.PhotoEntry) obj).reset();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).reset();
            }
            this.t0.W(i9);
        }
        return indexOf;
    }

    public final void Y() {
        this.n.clear();
        xp0 xp0Var = this.H;
        if (xp0Var != null) {
            xp0Var.l();
        }
        this.J.e(false, true);
        b0();
    }

    public final void Z(View view, Object obj) {
        boolean z10 = X(-1, obj) == -1;
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(this.c.contains(Integer.valueOf(this.F.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        h0(z10 ? 1 : 2);
        this.o0.a();
    }

    public final void a0(EditText editText) {
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f.clear();
        this.h.clear();
        this.s = true;
        c0(obj, "", this.a == 1, true);
        this.v = obj;
        if (obj.length() == 0) {
            this.v = null;
            this.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.J.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.v));
        }
        i0();
    }

    public final void b0() {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, this.n.size());
        int size = this.n.size();
        for (int i9 = 0; i9 < size; i9++) {
            edit.putString(j3.r0.l(i9, "recent"), (String) this.n.get(i9));
        }
        edit.commit();
    }

    public final void c0(String str, String str2, boolean z10, boolean z11) {
        if (this.r) {
            this.r = false;
            if (this.x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.x, true);
                this.x = 0;
            }
        }
        this.C = str;
        this.r = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
        TLObject userOrChat = messagesController.getUserOrChat(z10 ? messagesController2.gifSearchBot : messagesController2.imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z11 || this.B) {
                return;
            }
            this.B = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            MessagesController messagesController3 = MessagesController.getInstance(this.currentAccount);
            tL_contacts_resolveUsername.username = z10 ? messagesController3.gifSearchBot : messagesController3.imageSearchBot;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new kh.o3(11, this, z10));
            return;
        }
        TLRPC.User user = (TLRPC.User) userOrChat;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.offset = str2;
        qn qnVar = this.Q;
        if (qnVar != null) {
            long a2 = qnVar.a();
            if (DialogObject.isEncryptedDialog(a2)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().getInputPeer(a2);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i9 = this.y + 1;
        this.y = i9;
        this.x = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.lb(this, str, i9, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.x, this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.U = false;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = this.q0;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = this.r0;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, this.s0, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.a;
        int i12 = 1;
        MediaController.AlbumEntry albumEntry = this.F;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 10));
        int i13 = 2;
        if (this.h0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            a2.setSubMenuDelegate(new qp0(this));
            this.M = a2.e(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            a2.e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            org.telegram.ui.ActionBar.w0 a3 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a3.F();
            a3.D = new rp0(this);
            this.L = a3;
            EditTextBoldCursor searchField = a3.getSearchField();
            searchField.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            searchField.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            searchField.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Vd, false));
        }
        if (albumEntry == null) {
            if (i11 == 0) {
                this.L.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i11 == 1) {
                this.L.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        sp0 sp0Var = new sp0(this, context);
        this.b0 = sp0Var;
        sp0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.fragmentView = this.b0;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.G = wk0Var;
        wk0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.G.setClipToPadding(false);
        this.G.setHorizontalScrollBarEnabled(false);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.setItemAnimator(null);
        this.G.setLayoutAnimation(null);
        org.telegram.ui.Components.wk0 wk0Var2 = this.G;
        int i14 = 4;
        tp0 tp0Var = new tp0(4);
        this.I = tp0Var;
        wk0Var2.setLayoutManager(tp0Var);
        this.I.O = new up0(this);
        this.b0.addView(this.G, g7.e6.e(-1, -1, 51));
        org.telegram.ui.Components.wk0 wk0Var3 = this.G;
        xp0 xp0Var = new xp0(this, context);
        this.H = xp0Var;
        wk0Var3.setAdapter(xp0Var);
        this.G.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.G.setOnItemClickListener(new i(this, 20));
        if (this.D != 1) {
            this.G.setOnItemLongClickListener(new mp0(this, i13));
        }
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(new vp0(this));
        this.R = yk0Var;
        if (this.D != 1) {
            this.G.A.add(yk0Var);
        }
        eh.o oVar = new eh.o(context, i12, getResourceProvider());
        this.K = oVar;
        oVar.setAlpha(0.0f);
        this.K.setVisibility(8);
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, this.K, 1, getResourceProvider());
        this.J = gw0Var;
        gw0Var.setAnimateLayoutChange(true);
        this.J.d.setTypeface(Typeface.DEFAULT);
        this.J.d.setTextSize(1, 16.0f);
        this.J.d.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.y6));
        this.J.addView(this.K, 0);
        if (albumEntry != null) {
            this.J.d.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.J.e(false, false);
        this.b0.addView(this.J, g7.e6.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.G.setOnScrollListener(new op0(this));
        if (albumEntry == null) {
            i0();
        }
        if (this.m0) {
            View view = new View(context);
            this.Y = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.Y.setTranslationY(AndroidUtilities.dp(48.0f));
            this.b0.addView(this.Y, g7.e6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.V = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            this.V.setVisibility(4);
            this.V.setTranslationY(AndroidUtilities.dp(48.0f));
            this.b0.addView(this.V, g7.e6.e(-1, 48, 83));
            this.V.setOnTouchListener(new jh.d(2));
            org.telegram.ui.Components.ut utVar = this.Z;
            if (utVar != null) {
                utVar.o();
            }
            this.Z = new org.telegram.ui.Components.ut(context, this.b0, null, 1, false, null);
            this.Z.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.Z.setHint(LocaleController.getString(R.string.AddCaption));
            this.Z.s();
            org.telegram.ui.Components.mt editText = this.Z.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.V.addView(this.Z, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.Z.setText(charSequence);
            }
            this.Z.getEditText().addTextChangedListener(new o0(this, 14));
            m0 m0Var = new m0(this, context, 17);
            this.W = m0Var;
            m0Var.setFocusable(true);
            this.W.setFocusableInTouchMode(true);
            this.W.setVisibility(4);
            this.W.setScaleX(0.2f);
            this.W.setScaleY(0.2f);
            this.W.setAlpha(0.0f);
            this.b0.addView(this.W, g7.e6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.a0 = new ImageView(context);
            this.a0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.S5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.T5, false)));
            this.a0.setImageResource(R.drawable.attach_send);
            this.a0.setImportantForAccessibility(2);
            this.a0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.U5, false), PorterDuff.Mode.MULTIPLY));
            this.a0.setScaleType(ImageView.ScaleType.CENTER);
            this.a0.setOutlineProvider(new bg.q1(18));
            this.W.addView(this.a0, g7.e6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.a0.setOnClickListener(new q50(this, 19));
            this.a0.setOnLongClickListener(new u(this, i14));
            float dp = AndroidUtilities.dp(12.0f);
            TextPaint textPaint = this.d0;
            textPaint.setTextSize(dp);
            textPaint.setTypeface(AndroidUtilities.bold());
            yi0 yi0Var = new yi0(this, context, i13);
            this.X = yi0Var;
            yi0Var.setAlpha(0.0f);
            this.X.setScaleX(0.2f);
            this.X.setScaleY(0.2f);
            this.b0.addView(this.X, g7.e6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.P != 0) {
                this.Z.setVisibility(8);
            }
        }
        this.e = (albumEntry != null || i11 == 0 || i11 == 1) && this.E;
        this.G.setEmptyView(this.J);
        org.telegram.ui.Components.wk0 wk0Var4 = this.G;
        wk0Var4.U1 = true;
        wk0Var4.V1 = 0;
        h0(0);
        return this.fragmentView;
    }

    public final void d0(int i9, boolean z10) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.o0 == null || this.O) {
            return;
        }
        org.telegram.ui.Components.ut utVar = this.Z;
        if (utVar != null && utVar.a.length() > 0) {
            Object obj = hashMap.get(this.c.get(0));
            if (obj instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) obj).caption = this.Z.getText().toString();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).caption = this.Z.getText().toString();
            }
        }
        this.O = true;
        this.o0.i(i9, false, z10);
        if (this.P != 2) {
            yp0 yp0Var = this.o0;
            if (yp0Var == null || yp0Var.e()) {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(int i9, boolean z10) {
        this.D = i9;
        this.E = z10;
        if (i9 <= 0 || this.a != 1) {
            return;
        }
        this.D = 1;
    }

    public final boolean f0(boolean z10, boolean z11) {
        if (this.Z != null) {
            if (z10 != (this.V.getTag() != null)) {
                AnimatorSet animatorSet = this.g0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.V.setTag(z10 ? 1 : null);
                if (this.Z.getEditText().isFocused()) {
                    AndroidUtilities.hideKeyboard(this.Z.getEditText());
                }
                this.Z.k(true);
                if (z10) {
                    this.V.setVisibility(0);
                    this.W.setVisibility(0);
                }
                if (!z11) {
                    this.W.setScaleX(z10 ? 1.0f : 0.2f);
                    this.W.setScaleY(z10 ? 1.0f : 0.2f);
                    this.W.setAlpha(z10 ? 1.0f : 0.0f);
                    this.X.setScaleX(z10 ? 1.0f : 0.2f);
                    this.X.setScaleY(z10 ? 1.0f : 0.2f);
                    this.X.setAlpha(z10 ? 1.0f : 0.0f);
                    this.V.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
                    this.Y.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(48.0f));
                    if (!z10) {
                        this.V.setVisibility(4);
                        this.W.setVisibility(4);
                    }
                    return true;
                }
                this.g0 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                m0 m0Var = this.W;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(m0Var, (Property<m0, Float>) property, z10 ? 1.0f : 0.2f));
                m0 m0Var2 = this.W;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(m0Var2, (Property<m0, Float>) property2, z10 ? 1.0f : 0.2f));
                m0 m0Var3 = this.W;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(m0Var3, (Property<m0, Float>) property3, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.X, (Property<yi0, Float>) property, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.X, (Property<yi0, Float>) property2, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.X, (Property<yi0, Float>) property3, z10 ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.V;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.Y, (Property<View, Float>) property4, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
                this.g0.playTogether(arrayList);
                this.g0.setInterpolator(new DecelerateInterpolator());
                this.g0.setDuration(180L);
                this.g0.addListener(new n60(3, this, z10));
                this.g0.start();
                return true;
            }
        }
        return false;
    }

    public final void g0() {
        if (this.e) {
            int childCount = this.G.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = this.G.getChildAt(i9);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.t5;
                MediaController.AlbumEntry albumEntry = this.F;
                ArrayList arrayList = this.c;
                if (z10) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (albumEntry != null) {
                        t5Var.setNum(this.e ? arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(num.intValue()).imageId)) : -1);
                    } else {
                        t5Var.setNum(this.e ? arrayList.indexOf(((MediaController.SearchImage) this.f.get(num.intValue())).id) : -1);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    ((org.telegram.ui.Cells.i7) childAt).b(arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0, false);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b0, 1, null, null, null, null, this.q0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, this.q0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, this.s0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_27, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var != null ? w0Var.getSearchField() : null, 16777216, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 32768, null, null, null, null, this.q0));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.R4}, null, org.telegram.ui.ActionBar.f6.da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.f6.X9));
        return arrayList;
    }

    public final void h0(int i9) {
        if (this.b.size() == 0) {
            this.X.setPivotX(0.0f);
            this.X.setPivotY(0.0f);
            f0(false, i9 != 0);
            return;
        }
        this.X.invalidate();
        if (f0(true, i9 != 0) || i9 == 0) {
            this.X.setPivotX(0.0f);
            this.X.setPivotY(0.0f);
            return;
        }
        this.X.setPivotX(AndroidUtilities.dp(21.0f));
        this.X.setPivotY(AndroidUtilities.dp(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.X, (Property<yi0, Float>) View.SCALE_X, i9 == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.X, (Property<yi0, Float>) View.SCALE_Y, i9 == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    public final void i0() {
        String str;
        xp0 xp0Var = this.H;
        if (xp0Var != null) {
            xp0Var.l();
        }
        if (this.r || (this.n.size() > 0 && ((str = this.v) == null || TextUtils.isEmpty(str)))) {
            this.J.e(true, true);
        } else {
            this.J.e(false, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ut utVar = this.Z;
        if (utVar == null || !utVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        utVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        if (this.x != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.x, true);
            this.x = 0;
        }
        org.telegram.ui.Components.ut utVar = this.Z;
        if (utVar != null) {
            utVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPanTranslationUpdate(float f10) {
        org.telegram.ui.Components.wk0 wk0Var = this.G;
        if (wk0Var == null) {
            return;
        }
        if (!this.Z.e) {
            wk0Var.setTranslationY(f10);
        } else {
            this.fragmentView.setTranslationY(f10);
            this.G.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        xp0 xp0Var = this.H;
        if (xp0Var != null) {
            xp0Var.l();
        }
        org.telegram.ui.Components.ut utVar = this.Z;
        if (utVar != null) {
            utVar.s();
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.L;
        if (w0Var != null) {
            w0Var.z(true);
            if (!TextUtils.isEmpty(this.l0)) {
                this.L.H(this.l0, false);
                this.l0 = null;
                a0(this.L.getSearchField());
            }
            getParentActivity().getWindow().setSoftInputMode(32);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        if (!z10 || (w0Var = this.L) == null) {
            return;
        }
        AndroidUtilities.showKeyboard(w0Var.getSearchField());
    }
}
