package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ss extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.t40 {
    public qs E;
    public org.telegram.ui.Cells.r8 F;
    public MessagesController.DialogPhotos G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public rs O;
    public final org.telegram.ui.Components.u40 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.x9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.d61 W;
    public boolean X;
    public boolean Y;
    public MessageObject Z;
    public org.telegram.ui.ActionBar.v0 a;
    public org.telegram.ui.Cells.i3 b;
    public org.telegram.ui.Cells.i3 c;
    public org.telegram.ui.Cells.i3 d;
    public org.telegram.ui.Components.x9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.i9 n;
    public final org.telegram.ui.ActionBar.f6 r;
    public RadialProgressView s;
    public di.r6 v;
    public AnimatorSet w;
    public org.telegram.ui.Cells.r8 x;
    public org.telegram.ui.Cells.r8 y;

    public ss(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.u40(0, true, true);
    }

    public static /* synthetic */ void U(ss ssVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = ssVar.getMessagesController().getInputUser(ssVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(ssVar.currentAccount).sendRequest(tL_users_suggestBirthday, new m(ssVar, 5));
    }

    public static /* synthetic */ void V(ss ssVar, TLRPC.User user) {
        ssVar.Q = null;
        ssVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(ssVar.currentAccount).getUserFull(ssVar.H);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            ssVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = ssVar.T;
        if (photo != null) {
            user2.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null) {
                user2.photo.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                user2.photo.photo_big = closestPhotoSizeWithSize2.location;
            }
        } else {
            user2.photo = null;
            user2.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        ssVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        ssVar.g0();
        ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static /* synthetic */ void W(ss ssVar) {
        TLRPC.User user;
        if (ssVar.e == null || (user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H))) == null) {
            return;
        }
        ssVar.n.m(ssVar.currentAccount, user);
        ssVar.e.invalidate();
    }

    public static void X(ss ssVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        org.telegram.ui.Components.u40 u40Var = ssVar.P;
        if (u40Var.T) {
            return;
        }
        int i10 = ssVar.S;
        if (i10 == 2) {
            ssVar.Q = photoSize.location;
        } else if (i10 == 1 && ssVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.d5 parentLayout = ssVar.getParentLayout();
            org.telegram.ui.ActionBar.n2 lastFragment = ssVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                if (n2Var instanceof co) {
                    co coVar = (co) n2Var;
                    org.telegram.ui.ActionBar.n2 n2Var2 = lastFragment;
                    if (coVar.a() == ssVar.H && coVar.R3 == 0) {
                        coVar.Wa(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            if (arrayList.get(size2) != n2Var3) {
                                ((org.telegram.ui.ActionBar.n2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            n2Var2 = n2Var3;
                        }
                        n2Var2.finishFragment();
                    } else {
                        lastFragment = n2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.n2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            ssVar.e.h(ImageLocation.getForLocal(ssVar.Q), "50_50", ssVar.n, ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H)));
            if (ssVar.S == 2) {
                ssVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(ssVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = ssVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = ssVar.getUserConfig().getNewMessageId();
                tL_messageService.id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = ssVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = ssVar.H;
                tL_messageService.date = ssVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(ssVar.currentAccount, tL_messageService, false, false);
                ssVar.Z = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(ssVar.currentAccount).updateInterfaceWithMessages(ssVar.H, arrayList2, 0);
                ssVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, u40Var);
            }
        } else {
            TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
            if (ssVar.Z == null && user != null) {
                boolean z11 = inputFile2 != null;
                user.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z11;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(user);
                ssVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            ssVar.d0(ssVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, ssVar.S);
            ssVar.e0(false, true);
        }
        ssVar.g0();
    }

    public static void Y(ss ssVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (ssVar.Z != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
        TLRPC.UserFull userFull = MessagesController.getInstance(ssVar.currentAccount).getUserFull(ssVar.H);
        if (userFull != null) {
            userFull.personal_photo = tL_photos_photo.photo;
            userFull.flags |= TLObject.FLAG_21;
            ssVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        if (user != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null && fileLocation != null) {
                FileLoader.getInstance(ssVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(ssVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileLocation.volume_id);
                sb2.append("_");
                String n10 = a4.a.n(fileLocation.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(ssVar.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(ssVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(ssVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            yf.e0.a(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            ssVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            ssVar.getMessagesController().getDialogPhotos(ssVar.H).addPhotoAtStart(tL_photos_photo.photo);
            ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (ssVar.getParentActivity() != null) {
                if (i10 == 2) {
                    org.telegram.ui.Components.yc.a0(ssVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.yc.a0(ssVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                }
            }
        }
        ssVar.Q = null;
        ssVar.g0();
    }

    public static /* synthetic */ void Z(ss ssVar) {
        if (ssVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(ssVar.Z.getId()));
            NotificationCenter.getInstance(ssVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void C(float f7) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.t40
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.t40
    public final void P() {
        AndroidUtilities.runOnUIThread(new ks(this, 1));
    }

    @Override // org.telegram.ui.Components.t40
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.is
            @Override // java.lang.Runnable
            public final void run() {
                ss.X(ss.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    public final String c0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.L : user.phone;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.r;
        final int i11 = 0;
        kVar.B(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i12 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.I) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new os(this));
        this.a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i13 = org.telegram.ui.ActionBar.j6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i13));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i14 = org.telegram.ui.ActionBar.j6.d6;
        frameLayout2.setBackgroundColor(getThemedColor(i14));
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.e = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.V.addView(this.e, w7.x5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        di.r6 r6Var = new di.r6(this, context, paint, 8);
        this.v = r6Var;
        this.V.addView(r6Var, w7.x5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.s.setProgressColor(-1);
        this.s.setNoProgress(false);
        this.V.addView(this.s, w7.x5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = this.V;
        TextView textView3 = this.f;
        boolean z10 = LocaleController.isRTL;
        TextView f7 = org.telegram.ui.Cells.p6.f(frameLayout3, textView3, w7.x5.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 25.66f, z10 ? 94.0f : 0.0f, 0.0f), context);
        this.h = f7;
        f7.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout frameLayout4 = this.V;
        TextView textView4 = this.h;
        boolean z11 = LocaleController.isRTL;
        frameLayout4.addView(textView4, w7.x5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 94.0f, 49.66f, z11 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.r);
        this.b = i3Var;
        i3Var.b.setImeOptions(5);
        this.b.setBackgroundColor(getThemedColor(i14));
        this.b.setDivider(true);
        this.b.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ms
            public final /* synthetic */ ss b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i15 == 5) {
                            ss ssVar = this.b;
                            ssVar.c.b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = ssVar.c.b;
                            g3Var.setSelection(g3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ss ssVar2 = this.b;
                        if (i15 != 6) {
                            if (i15 == 5) {
                                ssVar2.d.b.requestFocus();
                                ssVar2.d.b.setSelection(ssVar2.c.b.length());
                                break;
                            }
                        } else {
                            ssVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i15 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.b.b.setOnFocusChangeListener(new ps());
        this.b.setText(this.M);
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.r);
        this.c = i3Var2;
        i3Var2.b.setImeOptions(5);
        this.c.setBackgroundColor(getThemedColor(i14));
        this.c.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ms
            public final /* synthetic */ ss b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i15 == 5) {
                            ss ssVar = this.b;
                            ssVar.c.b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = ssVar.c.b;
                            g3Var.setSelection(g3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ss ssVar2 = this.b;
                        if (i15 != 6) {
                            if (i15 == 5) {
                                ssVar2.d.b.requestFocus();
                                ssVar2.d.b.setSelection(ssVar2.c.b.length());
                                break;
                            }
                        } else {
                            ssVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i15 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        this.c.setText(this.N);
        org.telegram.ui.Cells.i3 i3Var3 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.r);
        this.d = i3Var3;
        i3Var3.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.gc));
        this.d.b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i14));
        final int i15 = 2;
        this.d.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ms
            public final /* synthetic */ ss b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i152, KeyEvent keyEvent) {
                switch (i15) {
                    case 0:
                        if (i152 == 5) {
                            ss ssVar = this.b;
                            ssVar.c.b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = ssVar.c.b;
                            g3Var.setSelection(g3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ss ssVar2 = this.b;
                        if (i152 != 6) {
                            if (i152 == 5) {
                                ssVar2.d.b.requestFocus();
                                ssVar2.d.b.setSelection(ssVar2.c.b.length());
                                break;
                            }
                        } else {
                            ssVar2.a.performClick();
                            break;
                        }
                        break;
                    default:
                        if (i152 == 6) {
                            this.b.a.performClick();
                            break;
                        }
                        break;
                }
                return true;
            }
        });
        if (!this.I) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, f6Var);
            this.x = r8Var;
            r8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.x.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            org.telegram.ui.Cells.r8 r8Var2 = this.x;
            int i16 = org.telegram.ui.ActionBar.j6.v6;
            int i17 = org.telegram.ui.ActionBar.j6.u6;
            r8Var2.e(i16, i17);
            final org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.x.e.setAnimation(xi0Var);
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ns
                public final /* synthetic */ ss b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            final ss ssVar = this.b;
                            ssVar.R = 1;
                            org.telegram.ui.Components.u40 u40Var = ssVar.P;
                            TLRPC.User user2 = user;
                            u40Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ah.j jVar = new ah.j(19);
                            final int i18 = 1;
                            final org.telegram.ui.Components.xi0 xi0Var2 = xi0Var;
                            u40Var.o(z12, jVar, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ls
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            ss ssVar2 = ssVar;
                                            boolean h = ssVar2.P.h();
                                            org.telegram.ui.Components.xi0 xi0Var3 = xi0Var2;
                                            if (!h) {
                                                xi0Var3.N(86);
                                                ssVar2.y.e.d();
                                                break;
                                            } else {
                                                xi0Var3.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            ss ssVar3 = ssVar;
                                            boolean h10 = ssVar3.P.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var2;
                                            if (!h10) {
                                                xi0Var4.N(85);
                                                ssVar3.x.e.d();
                                                break;
                                            } else {
                                                xi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            xi0Var2.K(0);
                            xi0Var2.N(43);
                            ssVar.x.e.d();
                            break;
                        default:
                            final ss ssVar2 = this.b;
                            ssVar2.R = 2;
                            org.telegram.ui.Components.u40 u40Var2 = ssVar2.P;
                            TLRPC.User user3 = user;
                            u40Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ah.j jVar2 = new ah.j(19);
                            final int i19 = 0;
                            final org.telegram.ui.Components.xi0 xi0Var3 = xi0Var;
                            u40Var2.o(z13, jVar2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ls
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            ss ssVar22 = ssVar2;
                                            boolean h = ssVar22.P.h();
                                            org.telegram.ui.Components.xi0 xi0Var32 = xi0Var3;
                                            if (!h) {
                                                xi0Var32.N(86);
                                                ssVar22.y.e.d();
                                                break;
                                            } else {
                                                xi0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            ss ssVar3 = ssVar2;
                                            boolean h10 = ssVar3.P.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var3;
                                            if (!h10) {
                                                xi0Var4.N(85);
                                                ssVar3.x.e.d();
                                                break;
                                            } else {
                                                xi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            xi0Var3.K(0);
                            xi0Var3.N(43);
                            ssVar2.y.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(context, f6Var);
            this.y = r8Var3;
            r8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.y.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.y.e(i16, i17);
            final org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.y.e.setAnimation(xi0Var2);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ns
                public final /* synthetic */ ss b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            final ss ssVar = this.b;
                            ssVar.R = 1;
                            org.telegram.ui.Components.u40 u40Var = ssVar.P;
                            TLRPC.User user2 = user;
                            u40Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ah.j jVar = new ah.j(19);
                            final int i18 = 1;
                            final org.telegram.ui.Components.xi0 xi0Var22 = xi0Var2;
                            u40Var.o(z12, jVar, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ls
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            ss ssVar22 = ssVar;
                                            boolean h = ssVar22.P.h();
                                            org.telegram.ui.Components.xi0 xi0Var32 = xi0Var22;
                                            if (!h) {
                                                xi0Var32.N(86);
                                                ssVar22.y.e.d();
                                                break;
                                            } else {
                                                xi0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            ss ssVar3 = ssVar;
                                            boolean h10 = ssVar3.P.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var22;
                                            if (!h10) {
                                                xi0Var4.N(85);
                                                ssVar3.x.e.d();
                                                break;
                                            } else {
                                                xi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            xi0Var22.K(0);
                            xi0Var22.N(43);
                            ssVar.x.e.d();
                            break;
                        default:
                            final ss ssVar2 = this.b;
                            ssVar2.R = 2;
                            org.telegram.ui.Components.u40 u40Var2 = ssVar2.P;
                            TLRPC.User user3 = user;
                            u40Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ah.j jVar2 = new ah.j(19);
                            final int i19 = 0;
                            final org.telegram.ui.Components.xi0 xi0Var3 = xi0Var2;
                            u40Var2.o(z13, jVar2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ls
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            ss ssVar22 = ssVar2;
                                            boolean h = ssVar22.P.h();
                                            org.telegram.ui.Components.xi0 xi0Var32 = xi0Var3;
                                            if (!h) {
                                                xi0Var32.N(86);
                                                ssVar22.y.e.d();
                                                break;
                                            } else {
                                                xi0Var32.L(0, false, false);
                                                break;
                                            }
                                        default:
                                            ss ssVar3 = ssVar2;
                                            boolean h10 = ssVar3.P.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var3;
                                            if (!h10) {
                                                xi0Var4.N(85);
                                                ssVar3.x.e.d();
                                                break;
                                            } else {
                                                xi0Var4.L(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            xi0Var3.K(0);
                            xi0Var3.N(43);
                            ssVar2.y.e.d();
                            break;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.x9(context);
            this.E = new qs(this, context, f6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.i9(0, user);
            }
            this.U.e(user.photo, this.n);
            this.E.addView(this.U, w7.x5.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.E.e(i16, i17);
            this.E.setOnClickListener(new z(this, context, user, 10));
            org.telegram.ui.Cells.r8 r8Var4 = new org.telegram.ui.Cells.r8(context, f6Var);
            this.F = r8Var4;
            r8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.F.e(i16, i17);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.ct(27, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.H);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.T = photo;
                if (photo == null) {
                    this.T = userFull.fallback_photo;
                }
            }
            g0();
        }
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(this, new b5(this, 7), new z0(this, 26), null);
        this.W = d61Var;
        d61Var.o1();
        this.W.setOnScrollListener(new ji.l3(4, this, frameLayout));
        this.W.setBackgroundColor(getThemedColor(i13));
        frameLayout.addView(this.W, w7.x5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.W);
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.Y2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.H);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i11 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i11 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i10 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new bi.fa(this, fileLocation, inputFile2, fileLocation2, i10, 7));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_STATUS) == 0) {
                return;
            }
            f0();
            return;
        }
        if (i10 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.G) {
            ArrayList arrayList = new ArrayList(dialogPhotos.photos);
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                this.T = (TLRPC.Photo) arrayList.get(0);
                g0();
            }
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final boolean e() {
        return this.S != 1;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        if (!z11) {
            if (z10) {
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                this.v.setAlpha(1.0f);
                this.v.setVisibility(0);
                return;
            }
            this.s.setAlpha(0.0f);
            this.s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        if (z10) {
            this.s.setVisibility(0);
            this.v.setVisibility(0);
            AnimatorSet animatorSet3 = this.w;
            RadialProgressView radialProgressView = this.s;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<di.r6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.v, (Property<di.r6, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new to(27, this, z10));
        this.w.start();
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f == null || (user = getMessagesController().getUser(Long.valueOf(this.H))) == null) {
            return;
        }
        if (TextUtils.isEmpty(c0())) {
            this.f.setText(LocaleController.getString(R.string.MobileHidden));
        } else {
            this.f.setText(gf.b.c().b("+" + c0()));
        }
        this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        if (this.Q == null) {
            org.telegram.ui.Components.x9 x9Var = this.e;
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(0, user);
            this.n = i9Var;
            x9Var.e(user, i9Var);
        }
    }

    public final void g0() {
        TLRPC.Photo photo;
        if (this.I) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.T) != null) {
            this.U.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, MediaDataController.MAX_STYLE_RUNS_COUNT), this.T), "50_50", this.n, null);
        }
        if (this.n == null) {
            this.n = new org.telegram.ui.Components.i9(0, user);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.e(user, this.n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.n, getMessagesController().getUser(Long.valueOf(this.H)));
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ cv0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.t40
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        TextView textView = this.f;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.i3 i3Var = this.b;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i3Var, TLObject.FLAG_23, null, null, null, null, i11));
        org.telegram.ui.Cells.i3 i3Var2 = this.b;
        int i12 = org.telegram.ui.ActionBar.j6.k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.i3 i3Var3 = this.b;
        int i13 = org.telegram.ui.ActionBar.j6.l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(i3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, TLObject.FLAG_23, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.H = getArguments().getLong("user_id", 0L);
        this.L = getArguments().getString("phone");
        this.M = getArguments().getString("first_name_card");
        this.N = getArguments().getString("last_name_card");
        this.I = getArguments().getBoolean("addContact", false);
        this.J = getArguments().getBoolean("focus_notes", false);
        this.K = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("dialog_bar_exception" + this.H, false);
        TLRPC.User user = this.H != 0 ? getMessagesController().getUser(Long.valueOf(this.H)) : null;
        org.telegram.ui.Components.u40 u40Var = this.P;
        if (u40Var != null) {
            u40Var.a = this;
            u40Var.b = this;
        }
        this.G = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.H);
        return user != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        org.telegram.ui.Components.u40 u40Var = this.P;
        if (u40Var != null) {
            u40Var.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        this.P.j();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        f0();
        this.P.l();
    }

    @Override // org.telegram.ui.Components.t40
    public final /* synthetic */ boolean t() {
        return false;
    }

    public ss(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.r = f6Var;
        this.P = new org.telegram.ui.Components.u40(0, true, true);
    }
}
