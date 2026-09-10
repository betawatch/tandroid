package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ya0(Object obj, long j3, TLObject tLObject, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = j3;
        this.b = tLObject;
        this.e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11 = this.a;
        TL_stories.StoryItem storyItem = null;
        int i12 = 0;
        long j3 = this.c;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                ab0 ab0Var = (ab0) obj3;
                LaunchActivity launchActivity = ab0Var.g;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (((String) obj2) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(launchActivity.O);
                    MessagesController messagesController = accountInstance.getMessagesController();
                    long j10 = this.c;
                    long j11 = -j10;
                    if (messagesController.getGroupCall(j11, false) == null) {
                        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j11);
                        if (chatFull != null) {
                            if (chatFull.call != null) {
                                accountInstance.getMessagesController().getGroupCall(j11, true, new za0(ab0Var, accountInstance, j10, p2Var, 0));
                                break;
                            } else if (p2Var.getParentActivity() != null) {
                                org.telegram.messenger.a2.o(R.string.InviteExpired, org.telegram.ui.Components.wc.a0(p2Var), R.raw.linkbroken, 36);
                                break;
                            }
                        }
                    } else {
                        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j11));
                        accountInstance.getMessagesController().getInputPeer(j10);
                        org.telegram.ui.Components.voip.e2.l(chat, null, false, Boolean.valueOf(!r3.call.rtmp_stream), launchActivity, p2Var, accountInstance);
                        break;
                    }
                }
                break;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) obj3;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                long j12 = this.c;
                org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(photoViewer, (String) obj2, photoEntry, j12, 4);
                if (!photoViewer.D2) {
                    TextureView textureView = photoViewer.B2;
                    Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.B2.getHeight());
                    if (bitmap != null) {
                        j2Var.run(bitmap);
                        break;
                    } else {
                        j2Var.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j12, null, true));
                        break;
                    }
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(photoViewer.C2.getWidth(), photoViewer.C2.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.C2, createBitmap, new ak0(15, j2Var, createBitmap));
                    break;
                }
            case 2:
                xh.x3 x3Var = (xh.x3) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (!((xh.v5) obj2).e) {
                    org.telegram.ui.Components.pc Q = x3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.t = true;
                    Q.j();
                    break;
                } else {
                    x3Var.v1(j3, callback);
                    break;
                }
            case 3:
                xh.x3.e0((xh.x3) obj3, j3, (TL_stars.TL_starGiftUnique) obj2, (wy) obj);
                break;
            case 4:
                xh.x3 x3Var2 = (xh.x3) obj3;
                x3Var2.getClass();
                ((boolean[]) obj2)[0] = true;
                x3Var2.j0.setLoading(false);
                x3Var2.v1(j3, (Utilities.Callback) obj);
                break;
            case 5:
                ((xh.v5) obj2).d0((MessageObject) obj, ((xh.b4) obj3).a, this.c, true, true, null);
                break;
            case 6:
                xh.v5 v5Var = (xh.v5) obj3;
                TLObject tLObject = (TLObject) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (!(tLObject instanceof TL_stars.starGiftUpgradePreview)) {
                    v5Var.getClass();
                    callback2.run(null);
                    break;
                } else {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    v5Var.M.put(Long.valueOf(j3), stargiftupgradepreview);
                    callback2.run(stargiftupgradepreview);
                    break;
                }
            case 7:
                xh.v5 v5Var2 = (xh.v5) obj3;
                Utilities.Callback callback3 = (Utilities.Callback) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (!v5Var2.e) {
                    xh.v5.e("NO_BALANCE");
                    callback3.run(null);
                    break;
                } else {
                    v5Var2.H(starGift, this.c, null, true, callback3);
                    break;
                }
            case 8:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0((eo) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j3, new Object[0]));
                }
                a02.s(document, string, charSequence).k(true);
                break;
            case 9:
                ((xh.v5) obj3).h0((LaunchActivity) obj, j3, (String) obj2);
                break;
            case 10:
                zh.i5 i5Var = (zh.i5) obj3;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList = i5Var.h;
                ArrayList arrayList2 = i5Var.g;
                int i13 = i5Var.a;
                FileLog.d("StoriesController update stories for dialog " + j3);
                i5Var.n0(j3, Collections.singletonList(tL_updateStory.story), false);
                i5Var.l0(j3, Collections.singletonList(tL_updateStory.story), true);
                a0.i iVar = i5Var.i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) iVar.f(j3);
                ArrayList arrayList3 = new ArrayList();
                int i14 = i5Var.u;
                if (peerStories == null) {
                    c10 = 1;
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        if (!zh.a6.w(i13, storyItem2)) {
                            if (j3 > 0 && (user == null || (!user.self && !i5Var.M(user)))) {
                                FileLog.d("StoriesController can't add user cause is not contact");
                                break;
                            } else {
                                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                                tL_peerStories.peer = tL_updateStory.peer;
                                tL_peerStories.stories.add(tL_updateStory.story);
                                hc.b.q(tL_updateStory.story.id, new StringBuilder("StoriesController add new user with story id="));
                                long peerDialogId = DialogObject.getPeerDialogId(tL_peerStories.peer);
                                i5Var.b0(peerDialogId, tL_peerStories);
                                if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                                    TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(peerDialogId));
                                    i5Var.g(tL_peerStories);
                                    if (user2 != null && !user2.stories_hidden) {
                                        i5Var.X(tL_peerStories);
                                    }
                                }
                                FileLog.d("StoriesController applyNewStories " + peerDialogId);
                                i5Var.n0(peerDialogId, tL_peerStories.stories, false);
                                i5Var.u = i5Var.u + 1;
                                i5Var.O(j3);
                            }
                        } else {
                            FileLog.d("StoriesController can't add user " + j3 + " with new story isExpired");
                            break;
                        }
                    } else {
                        FileLog.d("StoriesController can't add user " + j3 + " with new story DELETED");
                        break;
                    }
                } else {
                    TL_stories.StoryItem storyItem3 = tL_updateStory.story;
                    c10 = 1;
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        NotificationsController.getInstance(i13).processDeleteStory(j3, storyItem3.id);
                    }
                    int i15 = 0;
                    while (true) {
                        if (i15 >= peerStories.stories.size()) {
                            z11 = false;
                        } else if (peerStories.stories.get(i15).id != storyItem3.id) {
                            i15++;
                        } else if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i15);
                            hc.b.q(storyItem3.id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem4 = peerStories.stories.get(i15);
                            storyItem3 = zh.i5.f(storyItem4, storyItem3);
                            arrayList3.add(storyItem3);
                            peerStories.stories.set(i15, storyItem3);
                            if (storyItem3.attachPath == null) {
                                storyItem3.attachPath = storyItem4.attachPath;
                            }
                            if (storyItem3.firstFramePath == null) {
                                storyItem3.firstFramePath = storyItem4.firstFramePath;
                            }
                            hc.b.q(storyItem3.id, new StringBuilder("StoriesController update story id="));
                            z11 = true;
                        }
                    }
                    z12 = false;
                    if (!z11) {
                        if (!(storyItem3 instanceof TL_stories.TL_storyItemDeleted)) {
                            if (!zh.a6.w(i13, storyItem3)) {
                                if (j3 > 0 && (user == null || (!user.self && !i5Var.M(user)))) {
                                    FileLog.d("StoriesController can't add new story user is not contact");
                                    break;
                                } else {
                                    arrayList3.add(storyItem3);
                                    peerStories.stories.add(storyItem3);
                                    FileLog.d("StoriesController add new story id=" + storyItem3.id + " total stories count " + peerStories.stories.size());
                                    i5Var.W(j3, storyItem3);
                                    i5Var.g(peerStories);
                                    z10 = true;
                                    z12 = true;
                                }
                            } else {
                                FileLog.d("StoriesController can't add new story isExpired");
                                break;
                            }
                        } else {
                            FileLog.d("StoriesController can't add new story DELETED");
                            break;
                        }
                    } else {
                        z10 = false;
                    }
                    if (z12) {
                        if (!peerStories.stories.isEmpty() || i5Var.K(j3)) {
                            Collections.sort(peerStories.stories, zh.i5.X);
                        } else {
                            arrayList2.remove(peerStories);
                            arrayList.remove(peerStories);
                            iVar.l(DialogObject.getPeerDialogId(peerStories.peer));
                            i5Var.u--;
                        }
                    }
                    if (i14 != i5Var.u) {
                        i5Var.l.edit().putInt("total_stores", i5Var.u).apply();
                    }
                    i5Var.v(arrayList2);
                    i5Var.v(arrayList);
                    if (z10) {
                        if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
                            int i16 = NotificationCenter.storyDeleted;
                            Long valueOf = Long.valueOf(j3);
                            Integer valueOf2 = Integer.valueOf(tL_updateStory.story.id);
                            Object[] objArr = new Object[2];
                            i10 = 0;
                            objArr[0] = valueOf;
                            objArr[c10] = valueOf2;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, objArr);
                        } else {
                            i10 = 0;
                        }
                        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i10]);
                    }
                    MessagesController.getInstance(i13).checkArchiveFolder();
                    break;
                }
                z10 = true;
                if (i14 != i5Var.u) {
                }
                i5Var.v(arrayList2);
                i5Var.v(arrayList);
                if (z10) {
                }
                MessagesController.getInstance(i13).checkArchiveFolder();
                break;
            case 11:
                TLObject tLObject2 = (TLObject) obj2;
                sa0 sa0Var = (sa0) obj;
                zh.i5 i5Var2 = ((zh.p4) obj3).c;
                int i17 = i5Var2.a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(i17).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        while (true) {
                            if (i12 < peerStories2.stories.size()) {
                                if (!(peerStories2.stories.get(i12).media instanceof TLRPC.TL_messageMediaVideoStream) || (peerStories2.stories.get(i12) instanceof TL_stories.TL_storyItemSkipped)) {
                                    i12++;
                                } else {
                                    a0.i iVar2 = i5Var2.E;
                                    storyItem = peerStories2.stories.get(i12);
                                    iVar2.k(storyItem, j3);
                                }
                            }
                        }
                    }
                }
                sa0Var.accept(storyItem);
                break;
            case 12:
                TLObject tLObject3 = (TLObject) obj2;
                e2.h hVar = (e2.h) obj;
                zh.i5 i5Var3 = ((zh.q4) obj3).c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    MessagesController.getInstance(i5Var3.a).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i5Var3.a).putChats(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.i iVar3 = i5Var3.E;
                        storyItem = tL_stories_stories.stories.get(0);
                        iVar3.k(storyItem, j3);
                    }
                }
                hVar.accept(storyItem);
                break;
            default:
                long j13 = this.c;
                AndroidUtilities.runOnUIThread(new zh.f5((zh.z5) obj3, (View) obj2, j13, 3), 500L);
                ((zh.x5) obj).f(j13);
                break;
        }
    }

    public /* synthetic */ ya0(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = j3;
        this.e = obj3;
    }

    public /* synthetic */ ya0(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = j3;
    }

    public /* synthetic */ ya0(xh.v5 v5Var, LaunchActivity launchActivity, long j3, String str) {
        this.a = 9;
        this.d = v5Var;
        this.e = launchActivity;
        this.c = j3;
        this.b = str;
    }
}
