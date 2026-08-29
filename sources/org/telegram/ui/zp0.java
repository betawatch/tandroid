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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zp0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public boolean B;
    public String C;
    public int D;
    public boolean E;
    public final MediaController.AlbumEntry F;
    public org.telegram.ui.Components.jl0 G;
    public xp0 H;
    public tp0 I;
    public org.telegram.ui.Components.qw0 J;
    public hh.m K;
    public org.telegram.ui.ActionBar.w0 L;
    public org.telegram.ui.ActionBar.g1 M;
    public int N;
    public boolean O;
    public final int P;
    public final tn Q;
    public org.telegram.ui.Components.ll0 R;
    public int S;
    public boolean T;
    public boolean U;
    public FrameLayout V;
    public n0 W;
    public op0 X;
    public View Y;
    public org.telegram.ui.Components.au Z;
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

    public zp0(int i10, MediaController.AlbumEntry albumEntry, HashMap hashMap, ArrayList arrayList, int i11, boolean z10, tn tnVar, boolean z11) {
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
        this.a = i10;
        this.P = i11;
        this.Q = tnVar;
        this.A = z10;
        this.n0 = z11;
        if (albumEntry == null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0);
            int i12 = sharedPreferences.getInt(NotificationBadge.NewHtcHomeBadger.COUNT, 0);
            for (int i13 = 0; i13 < i12; i13++) {
                String string = sharedPreferences.getString("recent" + i13, null);
                if (string == null) {
                    break;
                }
                this.n.add(string);
            }
        }
        if (z11) {
            this.q0 = org.telegram.ui.ActionBar.g6.ug;
            this.r0 = org.telegram.ui.ActionBar.g6.hg;
            this.s0 = org.telegram.ui.ActionBar.g6.ig;
        } else {
            this.q0 = org.telegram.ui.ActionBar.g6.h5;
            this.r0 = org.telegram.ui.ActionBar.g6.j5;
            this.s0 = org.telegram.ui.ActionBar.g6.I5;
        }
    }

    public static /* synthetic */ void U(zp0 zp0Var, TLObject tLObject, boolean z10) {
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        MessagesController.getInstance(zp0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(zp0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(zp0Var.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
        String str = zp0Var.C;
        zp0Var.C = null;
        zp0Var.d0(str, "", z10, false);
    }

    public static org.telegram.ui.Cells.r5 V(zp0 zp0Var, int i10) {
        int childCount = zp0Var.G.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = zp0Var.G.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                int intValue = ((Integer) r5Var.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry == null ? !(intValue < 0 || intValue >= zp0Var.f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        return r5Var;
                    }
                }
            }
        }
        return null;
    }

    public final int Y(int i10, Object obj) {
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
            h0();
        }
        if (i10 >= 0) {
            if (z10) {
                ((MediaController.PhotoEntry) obj).reset();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).reset();
            }
            this.t0.W(i10);
        }
        return indexOf;
    }

    public final void Z() {
        this.n.clear();
        xp0 xp0Var = this.H;
        if (xp0Var != null) {
            xp0Var.l();
        }
        this.J.e(false, true);
        c0();
    }

    public final void a0(View view, Object obj) {
        boolean z10 = Y(-1, obj) == -1;
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).b(this.c.contains(Integer.valueOf(this.F.photos.get(((Integer) view.getTag()).intValue()).imageId)), true);
        }
        i0(z10 ? 1 : 2);
        this.o0.a();
    }

    public final void b0(EditText editText) {
        if (editText.getText().length() == 0) {
            return;
        }
        String obj = editText.getText().toString();
        this.f.clear();
        this.h.clear();
        this.s = true;
        d0(obj, "", this.a == 1, true);
        this.v = obj;
        if (obj.length() == 0) {
            this.v = null;
            this.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        } else {
            this.J.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, this.v));
        }
        j0();
    }

    public final void c0() {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("web_recent_search", 0).edit();
        edit.clear();
        edit.putInt(NotificationBadge.NewHtcHomeBadger.COUNT, this.n.size());
        int size = this.n.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.putString(j7.l1.k(i10, "recent"), (String) this.n.get(i10));
        }
        edit.commit();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i10 = 0;
        this.U = false;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = this.q0;
        lVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i12 = this.r0;
        lVar2.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i12, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, this.s0, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i13 = this.a;
        int i14 = 1;
        MediaController.AlbumEntry albumEntry = this.F;
        if (albumEntry != null) {
            this.actionBar.setTitle(albumEntry.bucketName);
        } else if (i13 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchImagesTitle));
        } else if (i13 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SearchGifsTitle));
        }
        int i15 = 2;
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, i15));
        if (this.h0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.ic_ab_other);
            a2.setSubMenuDelegate(new qp0(this));
            this.M = a2.e(1, R.drawable.msg_list, LocaleController.getString(R.string.ShowAsList));
            a2.e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        }
        if (albumEntry == null) {
            org.telegram.ui.ActionBar.w0 a10 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a10.F();
            a10.D = new rp0(this);
            this.L = a10;
            EditTextBoldCursor searchField = a10.getSearchField();
            searchField.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            searchField.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Vd, false));
        }
        if (albumEntry == null) {
            if (i13 == 0) {
                this.L.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
            } else if (i13 == 1) {
                this.L.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
        }
        sp0 sp0Var = new sp0(this, context);
        this.b0 = sp0Var;
        sp0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.fragmentView = this.b0;
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.G = jl0Var;
        jl0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
        this.G.setClipToPadding(false);
        this.G.setHorizontalScrollBarEnabled(false);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.setItemAnimator(null);
        this.G.setLayoutAnimation(null);
        org.telegram.ui.Components.jl0 jl0Var2 = this.G;
        int i16 = 4;
        tp0 tp0Var = new tp0(4);
        this.I = tp0Var;
        jl0Var2.setLayoutManager(tp0Var);
        this.I.O = new up0(this);
        this.b0.addView(this.G, i7.f6.e(-1, -1, 51));
        org.telegram.ui.Components.jl0 jl0Var3 = this.G;
        xp0 xp0Var = new xp0(this, context);
        this.H = xp0Var;
        jl0Var3.setAdapter(xp0Var);
        this.G.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.G.setOnItemClickListener(new j(this, 20));
        if (this.D != 1) {
            this.G.setOnItemLongClickListener(new lp0(this, i15));
        }
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(new vp0(this));
        this.R = ll0Var;
        if (this.D != 1) {
            this.G.A.add(ll0Var);
        }
        hh.m mVar = new hh.m(context, i14, getResourceProvider());
        this.K = mVar;
        mVar.setAlpha(0.0f);
        this.K.setVisibility(8);
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, this.K, 1, getResourceProvider());
        this.J = qw0Var;
        qw0Var.setAnimateLayoutChange(true);
        this.J.d.setTypeface(Typeface.DEFAULT);
        this.J.d.setTextSize(1, 16.0f);
        this.J.d.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.y6));
        this.J.addView(this.K, 0);
        if (albumEntry != null) {
            this.J.d.setText(LocaleController.getString(R.string.NoPhotos));
        } else {
            this.J.d.setText(LocaleController.getString(R.string.NoRecentSearches));
        }
        this.J.e(false, false);
        this.b0.addView(this.J, i7.f6.d(-1, -1.0f, 51, 0.0f, 126.0f, 0.0f, 0.0f));
        this.G.setOnScrollListener(new np0(this));
        if (albumEntry == null) {
            j0();
        }
        if (this.m0) {
            View view = new View(context);
            this.Y = view;
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            this.Y.setTranslationY(AndroidUtilities.dp(48.0f));
            this.b0.addView(this.Y, i7.f6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.V = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.V.setVisibility(4);
            this.V.setTranslationY(AndroidUtilities.dp(48.0f));
            this.b0.addView(this.V, i7.f6.e(-1, 48, 83));
            this.V.setOnTouchListener(new mh.d(2));
            org.telegram.ui.Components.au auVar = this.Z;
            if (auVar != null) {
                auVar.o();
            }
            this.Z = new org.telegram.ui.Components.au(context, this.b0, null, 1, false, null);
            this.Z.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
            this.Z.setHint(LocaleController.getString(R.string.AddCaption));
            this.Z.s();
            org.telegram.ui.Components.st editText = this.Z.getEditText();
            editText.setMaxLines(1);
            editText.setSingleLine(true);
            this.V.addView(this.Z, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.Z.setText(charSequence);
            }
            this.Z.getEditText().addTextChangedListener(new p0(this, 14));
            n0 n0Var = new n0(this, context, 17);
            this.W = n0Var;
            n0Var.setFocusable(true);
            this.W.setFocusableInTouchMode(true);
            this.W.setVisibility(4);
            this.W.setScaleX(0.2f);
            this.W.setScaleY(0.2f);
            this.W.setAlpha(0.0f);
            this.b0.addView(this.W, i7.f6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
            this.a0 = new ImageView(context);
            this.a0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.S5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T5, false)));
            this.a0.setImageResource(R.drawable.attach_send);
            this.a0.setImportantForAccessibility(2);
            this.a0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U5, false), PorterDuff.Mode.MULTIPLY));
            this.a0.setScaleType(ImageView.ScaleType.CENTER);
            this.a0.setOutlineProvider(new eg.k1(18));
            this.W.addView(this.a0, i7.f6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
            this.a0.setOnClickListener(new t50(this, 19));
            this.a0.setOnLongClickListener(new w(this, i16));
            float dp = AndroidUtilities.dp(12.0f);
            TextPaint textPaint = this.d0;
            textPaint.setTextSize(dp);
            textPaint.setTypeface(AndroidUtilities.bold());
            op0 op0Var = new op0(this, context, i10);
            this.X = op0Var;
            op0Var.setAlpha(0.0f);
            this.X.setScaleX(0.2f);
            this.X.setScaleY(0.2f);
            this.b0.addView(this.X, i7.f6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
            if (this.P != 0) {
                this.Z.setVisibility(8);
            }
        }
        this.e = (albumEntry != null || i13 == 0 || i13 == 1) && this.E;
        this.G.setEmptyView(this.J);
        org.telegram.ui.Components.jl0 jl0Var4 = this.G;
        jl0Var4.U1 = true;
        jl0Var4.V1 = 0;
        i0(0);
        return this.fragmentView;
    }

    public final void d0(String str, String str2, boolean z10, boolean z11) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolveUsername, new nh.l3(11, this, z10));
            return;
        }
        TLRPC.User user = (TLRPC.User) userOrChat;
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = str == null ? "" : str;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        tL_messages_getInlineBotResults.offset = str2;
        tn tnVar = this.Q;
        if (tnVar != null) {
            long a2 = tnVar.a();
            if (DialogObject.isEncryptedDialog(a2)) {
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            } else {
                tL_messages_getInlineBotResults.peer = getMessagesController().getInputPeer(a2);
            }
        } else {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        }
        int i10 = this.y + 1;
        this.y = i10;
        this.x = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.rb(this, str, i10, z10, user));
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(this.x, this.classGuid);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    public final void e0(int i10, boolean z10) {
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.o0 == null || this.O) {
            return;
        }
        org.telegram.ui.Components.au auVar = this.Z;
        if (auVar != null && auVar.a.length() > 0) {
            Object obj = hashMap.get(this.c.get(0));
            if (obj instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) obj).caption = this.Z.getText().toString();
            } else if (obj instanceof MediaController.SearchImage) {
                ((MediaController.SearchImage) obj).caption = this.Z.getText().toString();
            }
        }
        this.O = true;
        this.o0.h(i10, false, z10);
        if (this.P != 2) {
            yp0 yp0Var = this.o0;
            if (yp0Var == null || yp0Var.e()) {
                finishFragment();
            }
        }
    }

    public final void f0(int i10, boolean z10) {
        this.D = i10;
        this.E = z10;
        if (i10 <= 0 || this.a != 1) {
            return;
        }
        this.D = 1;
    }

    public final boolean g0(boolean z10, boolean z11) {
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
                n0 n0Var = this.W;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(n0Var, (Property<n0, Float>) property, z10 ? 1.0f : 0.2f));
                n0 n0Var2 = this.W;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(n0Var2, (Property<n0, Float>) property2, z10 ? 1.0f : 0.2f));
                n0 n0Var3 = this.W;
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(n0Var3, (Property<n0, Float>) property3, z10 ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.X, (Property<op0, Float>) property, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.X, (Property<op0, Float>) property2, z10 ? 1.0f : 0.2f));
                arrayList.add(ObjectAnimator.ofFloat(this.X, (Property<op0, Float>) property3, z10 ? 1.0f : 0.0f));
                FrameLayout frameLayout = this.V;
                Property property4 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property4, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
                arrayList.add(ObjectAnimator.ofFloat(this.Y, (Property<View, Float>) property4, z10 ? 0.0f : AndroidUtilities.dp(48.0f)));
                this.g0.playTogether(arrayList);
                this.g0.setInterpolator(new DecelerateInterpolator());
                this.g0.setDuration(180L);
                this.g0.addListener(new p60(3, this, z10));
                this.g0.start();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b0, 1, null, null, null, null, this.q0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, this.q0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, this.s0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        org.telegram.ui.ActionBar.w0 w0Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var != null ? w0Var.getSearchField() : null, 16777216, null, null, null, null, this.r0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 32768, null, null, null, null, this.q0));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.R4}, null, org.telegram.ui.ActionBar.g6.da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.g6.X9));
        return arrayList;
    }

    public final void h0() {
        if (this.e) {
            int childCount = this.G.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.G.getChildAt(i10);
                boolean z10 = childAt instanceof org.telegram.ui.Cells.r5;
                MediaController.AlbumEntry albumEntry = this.F;
                ArrayList arrayList = this.c;
                if (z10) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    Integer num = (Integer) childAt.getTag();
                    if (albumEntry != null) {
                        r5Var.setNum(this.e ? arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(num.intValue()).imageId)) : -1);
                    } else {
                        r5Var.setNum(this.e ? arrayList.indexOf(((MediaController.SearchImage) this.f.get(num.intValue())).id) : -1);
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) childAt).b(arrayList.indexOf(Integer.valueOf(albumEntry.photos.get(((Integer) childAt.getTag()).intValue()).imageId)) != 0, false);
                }
            }
        }
    }

    public final void i0(int i10) {
        if (this.b.size() == 0) {
            this.X.setPivotX(0.0f);
            this.X.setPivotY(0.0f);
            g0(false, i10 != 0);
            return;
        }
        this.X.invalidate();
        if (g0(true, i10 != 0) || i10 == 0) {
            this.X.setPivotX(0.0f);
            this.X.setPivotY(0.0f);
            return;
        }
        this.X.setPivotX(AndroidUtilities.dp(21.0f));
        this.X.setPivotY(AndroidUtilities.dp(12.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.X, (Property<op0, Float>) View.SCALE_X, i10 == 1 ? 1.1f : 0.9f, 1.0f), ObjectAnimator.ofFloat(this.X, (Property<op0, Float>) View.SCALE_Y, i10 == 1 ? 1.1f : 0.9f, 1.0f));
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(180L);
        animatorSet.start();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false)) > 0.721f;
    }

    public final void j0() {
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
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.au auVar = this.Z;
        if (auVar == null || !auVar.e) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        auVar.k(true);
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
        org.telegram.ui.Components.au auVar = this.Z;
        if (auVar != null) {
            auVar.o();
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPanTranslationUpdate(float f9) {
        org.telegram.ui.Components.jl0 jl0Var = this.G;
        if (jl0Var == null) {
            return;
        }
        if (!this.Z.e) {
            jl0Var.setTranslationY(f9);
        } else {
            this.fragmentView.setTranslationY(f9);
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
        org.telegram.ui.Components.au auVar = this.Z;
        if (auVar != null) {
            auVar.s();
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.L;
        if (w0Var != null) {
            w0Var.z(true);
            if (!TextUtils.isEmpty(this.l0)) {
                this.L.H(this.l0, false);
                this.l0 = null;
                b0(this.L.getSearchField());
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
