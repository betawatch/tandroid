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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ts extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50 {
    public rs E;
    public org.telegram.ui.Cells.s8 F;
    public MessagesController.DialogPhotos G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public ss O;
    public final org.telegram.ui.Components.e50 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.w9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.r61 W;
    public boolean X;
    public boolean Y;
    public MessageObject Z;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Cells.i3 b;
    public org.telegram.ui.Cells.i3 c;
    public org.telegram.ui.Cells.i3 d;
    public org.telegram.ui.Components.w9 e;
    public TextView f;
    public TextView h;
    public org.telegram.ui.Components.g9 n;
    public final org.telegram.ui.ActionBar.f6 r;
    public RadialProgressView s;
    public bi.s7 v;
    public AnimatorSet w;
    public org.telegram.ui.Cells.s8 x;
    public org.telegram.ui.Cells.s8 y;

    public ts(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.e50(0, true, true);
    }

    public static /* synthetic */ void U(ts tsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = tsVar.getMessagesController().getInputUser(tsVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(tsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new m(tsVar, 5));
    }

    public static /* synthetic */ void V(ts tsVar, TLRPC.User user) {
        tsVar.Q = null;
        tsVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(tsVar.currentAccount).getUserFull(tsVar.H);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            tsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = tsVar.T;
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
        tsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        tsVar.g0();
        tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static /* synthetic */ void W(ts tsVar) {
        TLRPC.User user;
        if (tsVar.e == null || (user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H))) == null) {
            return;
        }
        tsVar.n.m(tsVar.currentAccount, user);
        tsVar.e.invalidate();
    }

    public static void X(ts tsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        org.telegram.ui.Components.e50 e50Var = tsVar.P;
        if (e50Var.T) {
            return;
        }
        int i10 = tsVar.S;
        if (i10 == 2) {
            tsVar.Q = photoSize.location;
        } else if (i10 == 1 && tsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.f5 parentLayout = tsVar.getParentLayout();
            org.telegram.ui.ActionBar.p2 lastFragment = tsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(size);
                if (p2Var instanceof eo) {
                    eo eoVar = (eo) p2Var;
                    org.telegram.ui.ActionBar.p2 p2Var2 = lastFragment;
                    if (eoVar.a() == tsVar.H && eoVar.R3 == 0) {
                        eoVar.Wa(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                            if (arrayList.get(size2) != p2Var3) {
                                ((org.telegram.ui.ActionBar.p2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            p2Var2 = p2Var3;
                        }
                        p2Var2.finishFragment();
                    } else {
                        lastFragment = p2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.p2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            tsVar.e.h(ImageLocation.getForLocal(tsVar.Q), "50_50", tsVar.n, tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H)));
            if (tsVar.S == 2) {
                tsVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(tsVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = tsVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = tsVar.getUserConfig().getNewMessageId();
                tL_messageService.id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = tsVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = tsVar.H;
                tL_messageService.date = tsVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(tsVar.currentAccount, tL_messageService, false, false);
                tsVar.Z = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(tsVar.currentAccount).updateInterfaceWithMessages(tsVar.H, arrayList2, 0);
                tsVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, e50Var);
            }
        } else {
            TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
            if (tsVar.Z == null && user != null) {
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
                tsVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            tsVar.d0(tsVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, tsVar.S);
            tsVar.e0(false, true);
        }
        tsVar.g0();
    }

    public static void Y(ts tsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (tsVar.Z != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
        TLRPC.UserFull userFull = MessagesController.getInstance(tsVar.currentAccount).getUserFull(tsVar.H);
        if (userFull != null) {
            userFull.personal_photo = tL_photos_photo.photo;
            userFull.flags |= TLObject.FLAG_21;
            tsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        if (user != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT);
            if (closestPhotoSizeWithSize != null && fileLocation != null) {
                FileLoader.getInstance(tsVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(tsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileLocation.volume_id);
                sb2.append("_");
                String n10 = a4.a.n(fileLocation.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(tsVar.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(tsVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(tsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            xf.e0.a(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            tsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            tsVar.getMessagesController().getDialogPhotos(tsVar.H).addPhotoAtStart(tL_photos_photo.photo);
            tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (tsVar.getParentActivity() != null) {
                if (i10 == 2) {
                    org.telegram.ui.Components.wc.a0(tsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.wc.a0(tsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                }
            }
        }
        tsVar.Q = null;
        tsVar.g0();
    }

    public static /* synthetic */ void Z(ts tsVar) {
        if (tsVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(tsVar.Z.getId()));
            NotificationCenter.getInstance(tsVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final void C(float f7) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d50
    public final void P() {
        AndroidUtilities.runOnUIThread(new ls(this, 1));
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.js
            @Override // java.lang.Runnable
            public final void run() {
                ts.X(ts.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    public final String c0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.L : user.phone;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.r;
        final int i11 = 0;
        lVar.A(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i12 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.I) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ps(this));
        this.a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i13 = org.telegram.ui.ActionBar.j6.a7;
        frameLayout.setBackgroundColor(getThemedColor(i13));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i14 = org.telegram.ui.ActionBar.j6.d6;
        frameLayout2.setBackgroundColor(getThemedColor(i14));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.V.addView(this.e, w7.a6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        bi.s7 s7Var = new bi.s7(this, context, paint, 8);
        this.v = s7Var;
        this.V.addView(s7Var, w7.a6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.s.setProgressColor(-1);
        this.s.setNoProgress(false);
        this.V.addView(this.s, w7.a6.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
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
        TextView f7 = org.telegram.ui.Cells.r6.f(frameLayout3, textView3, w7.a6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 25.66f, z10 ? 94.0f : 0.0f, 0.0f), context);
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
        frameLayout4.addView(textView4, w7.a6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 94.0f, 49.66f, z11 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.r);
        this.b = i3Var;
        i3Var.b.setImeOptions(5);
        this.b.setBackgroundColor(getThemedColor(i14));
        this.b.setDivider(true);
        this.b.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ns
            public final /* synthetic */ ts b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i15 == 5) {
                            ts tsVar = this.b;
                            tsVar.c.b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = tsVar.c.b;
                            g3Var.setSelection(g3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ts tsVar2 = this.b;
                        if (i15 != 6) {
                            if (i15 == 5) {
                                tsVar2.d.b.requestFocus();
                                tsVar2.d.b.setSelection(tsVar2.c.b.length());
                                break;
                            }
                        } else {
                            tsVar2.a.performClick();
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
        this.b.b.setOnFocusChangeListener(new qs());
        this.b.setText(this.M);
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.r);
        this.c = i3Var2;
        i3Var2.b.setImeOptions(5);
        this.c.setBackgroundColor(getThemedColor(i14));
        this.c.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ns
            public final /* synthetic */ ts b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i15 == 5) {
                            ts tsVar = this.b;
                            tsVar.c.b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = tsVar.c.b;
                            g3Var.setSelection(g3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ts tsVar2 = this.b;
                        if (i15 != 6) {
                            if (i15 == 5) {
                                tsVar2.d.b.requestFocus();
                                tsVar2.d.b.setSelection(tsVar2.c.b.length());
                                break;
                            }
                        } else {
                            tsVar2.a.performClick();
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
        this.d.b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.ns
            public final /* synthetic */ ts b;

            {
                this.b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView5, int i152, KeyEvent keyEvent) {
                switch (i15) {
                    case 0:
                        if (i152 == 5) {
                            ts tsVar = this.b;
                            tsVar.c.b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = tsVar.c.b;
                            g3Var.setSelection(g3Var.length());
                            break;
                        }
                        break;
                    case 1:
                        ts tsVar2 = this.b;
                        if (i152 != 6) {
                            if (i152 == 5) {
                                tsVar2.d.b.requestFocus();
                                tsVar2.d.b.setSelection(tsVar2.c.b.length());
                                break;
                            }
                        } else {
                            tsVar2.a.performClick();
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
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, f6Var);
            this.x = s8Var;
            s8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.x.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            org.telegram.ui.Cells.s8 s8Var2 = this.x;
            int i16 = org.telegram.ui.ActionBar.j6.v6;
            int i17 = org.telegram.ui.ActionBar.j6.u6;
            s8Var2.e(i16, i17);
            final org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.x.e.setAnimation(hj0Var);
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.os
                public final /* synthetic */ ts b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            final ts tsVar = this.b;
                            tsVar.R = 1;
                            org.telegram.ui.Components.e50 e50Var = tsVar.P;
                            TLRPC.User user2 = user;
                            e50Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            bi.f0 f0Var = new bi.f0(13);
                            final int i18 = 1;
                            final org.telegram.ui.Components.hj0 hj0Var2 = hj0Var;
                            e50Var.o(z12, f0Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ms
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            ts tsVar2 = tsVar;
                                            boolean h = tsVar2.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var3 = hj0Var2;
                                            if (!h) {
                                                hj0Var3.P(86);
                                                tsVar2.y.e.d();
                                                break;
                                            } else {
                                                hj0Var3.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ts tsVar3 = tsVar;
                                            boolean h10 = tsVar3.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var2;
                                            if (!h10) {
                                                hj0Var4.P(85);
                                                tsVar3.x.e.d();
                                                break;
                                            } else {
                                                hj0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            hj0Var2.M(0);
                            hj0Var2.P(43);
                            tsVar.x.e.d();
                            break;
                        default:
                            final ts tsVar2 = this.b;
                            tsVar2.R = 2;
                            org.telegram.ui.Components.e50 e50Var2 = tsVar2.P;
                            TLRPC.User user3 = user;
                            e50Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            bi.f0 f0Var2 = new bi.f0(13);
                            final int i19 = 0;
                            final org.telegram.ui.Components.hj0 hj0Var3 = hj0Var;
                            e50Var2.o(z13, f0Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ms
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            ts tsVar22 = tsVar2;
                                            boolean h = tsVar22.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var32 = hj0Var3;
                                            if (!h) {
                                                hj0Var32.P(86);
                                                tsVar22.y.e.d();
                                                break;
                                            } else {
                                                hj0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ts tsVar3 = tsVar2;
                                            boolean h10 = tsVar3.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var3;
                                            if (!h10) {
                                                hj0Var4.P(85);
                                                tsVar3.x.e.d();
                                                break;
                                            } else {
                                                hj0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            hj0Var3.M(0);
                            hj0Var3.P(43);
                            tsVar2.y.e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var3 = new org.telegram.ui.Cells.s8(context, f6Var);
            this.y = s8Var3;
            s8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.y.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.y.e(i16, i17);
            final org.telegram.ui.Components.hj0 hj0Var2 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.y.e.setAnimation(hj0Var2);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.os
                public final /* synthetic */ ts b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            final ts tsVar = this.b;
                            tsVar.R = 1;
                            org.telegram.ui.Components.e50 e50Var = tsVar.P;
                            TLRPC.User user2 = user;
                            e50Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            bi.f0 f0Var = new bi.f0(13);
                            final int i18 = 1;
                            final org.telegram.ui.Components.hj0 hj0Var22 = hj0Var2;
                            e50Var.o(z12, f0Var, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ms
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            ts tsVar22 = tsVar;
                                            boolean h = tsVar22.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var32 = hj0Var22;
                                            if (!h) {
                                                hj0Var32.P(86);
                                                tsVar22.y.e.d();
                                                break;
                                            } else {
                                                hj0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ts tsVar3 = tsVar;
                                            boolean h10 = tsVar3.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var22;
                                            if (!h10) {
                                                hj0Var4.P(85);
                                                tsVar3.x.e.d();
                                                break;
                                            } else {
                                                hj0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 2);
                            hj0Var22.M(0);
                            hj0Var22.P(43);
                            tsVar.x.e.d();
                            break;
                        default:
                            final ts tsVar2 = this.b;
                            tsVar2.R = 2;
                            org.telegram.ui.Components.e50 e50Var2 = tsVar2.P;
                            TLRPC.User user3 = user;
                            e50Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            bi.f0 f0Var2 = new bi.f0(13);
                            final int i19 = 0;
                            final org.telegram.ui.Components.hj0 hj0Var3 = hj0Var2;
                            e50Var2.o(z13, f0Var2, new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.ms
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            ts tsVar22 = tsVar2;
                                            boolean h = tsVar22.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var32 = hj0Var3;
                                            if (!h) {
                                                hj0Var32.P(86);
                                                tsVar22.y.e.d();
                                                break;
                                            } else {
                                                hj0Var32.N(0, false, false);
                                                break;
                                            }
                                        default:
                                            ts tsVar3 = tsVar2;
                                            boolean h10 = tsVar3.P.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var3;
                                            if (!h10) {
                                                hj0Var4.P(85);
                                                tsVar3.x.e.d();
                                                break;
                                            } else {
                                                hj0Var4.N(0, false, false);
                                                break;
                                            }
                                    }
                                }
                            }, 1);
                            hj0Var3.M(0);
                            hj0Var3.P(43);
                            tsVar2.y.e.d();
                            break;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.w9(context);
            this.E = new rs(this, context, f6Var);
            if (this.n == null) {
                this.n = new org.telegram.ui.Components.g9(0, user);
            }
            this.U.e(user.photo, this.n);
            this.E.addView(this.U, w7.a6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.E.e(i16, i17);
            this.E.setOnClickListener(new a0(this, context, user, 10));
            org.telegram.ui.Cells.s8 s8Var4 = new org.telegram.ui.Cells.s8(context, f6Var);
            this.F = s8Var4;
            s8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.F.e(i16, i17);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.u10(24, this, user));
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
        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(this, new b5(this, 7), new a1(this, 26), null);
        this.W = r61Var;
        r61Var.o1();
        this.W.setOnScrollListener(new hi.p3(4, this, frameLayout));
        this.W.setBackgroundColor(getThemedColor(i13));
        frameLayout.addView(this.W, w7.a6.e(-1, -1, 119));
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new fg.e1(this, fileLocation, inputFile2, fileLocation2, i10));
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

    @Override // org.telegram.ui.Components.d50
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<bi.s7, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.v, (Property<bi.s7, Float>) property2, 0.0f));
        }
        this.w.setDuration(180L);
        this.w.addListener(new org.telegram.ui.Components.yo(22, this, z10));
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
            org.telegram.ui.Components.w9 w9Var = this.e;
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(0, user);
            this.n = g9Var;
            w9Var.e(user, g9Var);
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
            this.n = new org.telegram.ui.Components.g9(0, user);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.e(user, this.n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.n, getMessagesController().getUser(Long.valueOf(this.H)));
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ ev0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.r;
    }

    @Override // org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
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
        org.telegram.ui.Components.e50 e50Var = this.P;
        if (e50Var != null) {
            e50Var.a = this;
            e50Var.b = this;
        }
        this.G = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.H);
        return user != null && super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        org.telegram.ui.Components.e50 e50Var = this.P;
        if (e50Var != null) {
            e50Var.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        this.P.j();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        f0();
        this.P.l();
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean t() {
        return false;
    }

    public ts(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.r = f6Var;
        this.P = new org.telegram.ui.Components.e50(0, true, true);
    }
}
