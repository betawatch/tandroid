package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v41(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 1:
                ((b51) this.b).dismiss();
                break;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        di.d4 d4Var = secretMediaViewer.r;
                        if (d4Var.V) {
                            d4Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 3:
                b81 b81Var = (b81) this.b;
                if (b81Var.a0 instanceof TLRPC.User) {
                    di.d dVar = b81Var.h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        b81Var.U((TLRPC.User) b81Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 4:
                SessionsActivity sessionsActivity = ((b91) this.b).d;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        z9.e0(sessionsActivity.getParentActivity(), false, 2, new z81(sessionsActivity));
                        break;
                    }
                }
                break;
            case 5:
                ((re1) this.b).c(true);
                break;
            case 6:
                ((re1) ((nw0) this.b).c).c(true);
                break;
            case 7:
                ze1 ze1Var = (ze1) this.b;
                ArrayList arrayList = ze1Var.f;
                HashSet hashSet = ze1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ze1Var.getMessagesController().getUser(Long.valueOf(ze1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ze1Var.getMessagesController().putChat(chat, false);
                        ze1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    ze1Var.finishFragment();
                    break;
                }
                break;
            default:
                uj1 uj1Var = (uj1) this.b;
                uj1Var.a.c(!r0.b(), true);
                uj1Var.c.setEnabled(uj1Var.a.b());
                uj1Var.c.animate().alpha(uj1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
